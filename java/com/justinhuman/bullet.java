package com.justinhuman;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.view.WindowManager;
import android.content.Context;
import android.graphics.Point;
import android.content.res.Resources;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.util.TypedValue;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import java.io.InputStream;
import java.io.IOException;
import android.widget.Toast;
import android.view.View;
import android.view.MotionEvent;
import android.os.Build;
import android.os.Process;
import android.content.SharedPreferences;
public class bullet extends Service {
    float density;
    SharedPreferences configPrefs, sp;
    int dpi;
    RelativeLayout g_iconLayout;
    LinearLayout g_mainLayout,frame_layout,content_layout;
    int screenHeight;
    int screenWidth;
    WindowManager windowManager;
    static Context ctx;

    private RelativeLayout relativeLayout;
  Boolean bt = false;
    private int type;
    private void UpdateConfiguration(String s, Object v) {
        try {
            onSendConfig(s, v.toString());
            SharedPreferences.Editor configEditor = configPrefs.edit();
            configEditor.putString(s, v.toString());
            configEditor.apply();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        this.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        System.loadLibrary("pubgm");
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        final Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        screenWidth = point.x;
        screenHeight = point.y;
        dpi = Resources.getSystem().getDisplayMetrics().densityDpi;
        density = Resources.getSystem().getDisplayMetrics().density;
        this.g_iconLayout = relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        
        final ImageView imageView = new ImageView(this);
        imageView.setClickable(true);

        imageView.setLayoutParams(new ViewGroup.LayoutParams(dp(50), dp(50)));
        setImageFromAssets(imageView,"aimoff.png");

        relativeLayout.addView(imageView);
        final WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2,type, 8, -3);
        layoutParams2.gravity = 51;
        layoutParams2.x = 0;
        layoutParams2.y = 0;
        relativeLayout.setVisibility(8);
        windowManager.addView(relativeLayout,layoutParams2);
      //  windowManager.addView(imageView,layoutParams);
             imageView.setOnTouchListener(new View.OnTouchListener(){
                float deltaX;
                float deltaY;
                float newX;
                float newY;
                float pressedX;
                float pressedY;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int n = motionEvent.getActionMasked();
                    if (n != 0) {
                        if (n != 1) {
                            if (n != 2) {
                                return false;
                            }
                            newX = motionEvent.getRawX() + deltaX;
                            newY = motionEvent.getRawY() + deltaY;
                            float f = screenWidth - view.getWidth();
                            float f2 = screenHeight - view.getHeight();
                            if (newX < 0.0f) {
                                newX = 0.0f;
                            }
                            if (newX > f) {
                                newX = f;
                            }
                            if (newY < 0.0f) {
                                newY = 0.0f;
                            }
                            if (newY > f2) {
                                newY = f2;
                            }
                            layoutParams2.x = (int)newX;
                            layoutParams2.y = (int)newY;
                            windowManager.updateViewLayout(relativeLayout,layoutParams2);
                            return false;
                        }
                        int n2 = (int)(motionEvent.getRawX() - pressedX);
                        int n3 = (int)(motionEvent.getRawY() - pressedY);
                        if (n2 == 0 && n3 == 0) {
                            if (Floating.isBullet) {
                                UpdateConfiguration("HACK::ENABLE", Floating.isBullet ? 1 : 0);
                                Floating.isBullet = false;
                                setImageFromAssets(imageView,"aimon.png");
                            } else {
                                UpdateConfiguration("HACK::ENABLE", Floating.isBullet ? 1 : 0);
                                setImageFromAssets(imageView,"aimoff.png");
                                Floating.isBullet = true;
                            }
                            
                        }
                        return true;
                    }
                    this.deltaX = layoutParams2.x - motionEvent.getRawX();
                    this.deltaY = layoutParams2.y - motionEvent.getRawY();
                    this.pressedX = motionEvent.getRawX();
                    this.pressedY = motionEvent.getRawY();
                    return false;
                }
            });
        relativeLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
  windowManager.removeView(relativeLayout);
        // Process pro;
  //      Process.killProcess(Process.myPid());
    }
    
    private int dp(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }
    private native void onSendConfig(String s, String v);
    
    private void setImageFromAssets(ImageView image,String name){
        AssetManager assetManager=getBaseContext().getAssets();
        try{
            InputStream inputStream=assetManager.open(name);
            image.setImageDrawable(Drawable.createFromStream(inputStream,null));
        } catch (IOException e){
            Toast.makeText(this,"Error could not load image from assets folder \n"+e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
   // public native void Hack(int setting_code, boolean jboolean1);
    
    @Override
    public IBinder onBind(Intent intent) {
        
        return null;
    }
    
}
