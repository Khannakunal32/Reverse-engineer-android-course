package com.justinhuman;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.text.InputType;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\

// @JAGDISH_VIP // DEVELOPER // JAGDISH PAPA

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\

@SuppressWarnings("all")
public class Launcher {
    static {
        System.loadLibrary("pubgm");
    }

    private static SharedPreferences m_Prefs;
    public static void Init(Object object) {
        final Context m_Context = (Context) object;
        Activity m_Activity = (Activity) object;

        

        if (Build.VERSION.SDK_INT >= 23) {
            if (!Settings.canDrawOverlays(m_Context)) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + m_Context.getPackageName()));
                m_Activity.startActivity(intent);
            }
        }
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\

// @JAGDISH_VIP // DEVELOPER // JAGDISH PAPA

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\		
		
		m_Prefs = m_Context.getSharedPreferences("Kur0_Data", Context.MODE_PRIVATE);
        if (!m_Prefs.contains("USER_KEY")) {
            LinearLayout mainLayout = new LinearLayout(m_Context);
            mainLayout.setOrientation(LinearLayout.VERTICAL);
            mainLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            mainLayout.setPadding(45, 40, 45, 25);

            final EditText input = new EditText(m_Context);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            input.setHint("Your key here...");

            mainLayout.addView(input);

            AlertDialog.Builder builder = new AlertDialog.Builder(m_Context, 5);
            builder.setTitle("Please Enter Your Key");
            builder.setCancelable(false);
            builder.setView(mainLayout);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						String userKey = input.getText().toString();
						Login(m_Context, userKey);
					}
				});
            builder.show();
        } else {
            Login(m_Context, m_Prefs.getString("USER_KEY", null));
        }
    }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\

// @JAGDISH_VIP // DEVELOPER // JAGDISH PAPA

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\	
	
    private static void Login(final Context m_Context, final String userKey) {
		final ProgressDialog progressDialog = new ProgressDialog(m_Context, 5);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setMessage("Please wait...");
        progressDialog.setCancelable(false);
        progressDialog.show();

		final  Handler loginHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                if (msg.what == 0) {
                    Intent i = new Intent(m_Context.getApplicationContext(), Floating.class);
                    m_Context.startService(i);
                } else if (msg.what == 1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(m_Context, 5);
                    builder.setTitle("Key Status");
                    builder.setMessage(msg.obj.toString());
                    builder.setCancelable(false);

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								System.exit(0);
							}
						});
                    builder.show();
                }
                progressDialog.dismiss();
            }
        };

        new Thread(new Runnable() {
				@Override
				public void run() {
					String result = Check(m_Context, userKey);
					if (result.equals("OK")) {
						m_Prefs.edit().putString("USER_KEY", userKey).apply();

						loginHandler.sendEmptyMessage(0);
					} else {
						m_Prefs.edit().clear().apply();

						Message msg = new Message();
						msg.what = 1;
						msg.obj = result;
						loginHandler.sendMessage(msg);
					}
				}
			}).start(); 
    } 
    private static native String Check(Context mContext, String userKey);
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\

// @JAGDISH_VIP // DEVELOPER // JAGDISH PAPA

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\
