package com.justinhuman;


import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

import java.io.ByteArrayOutputStream;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import java.util.Random;
import android.view.Gravity;
import android.graphics.PixelFormat;
import android.view.ViewConfiguration;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Writer;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import android.text.Html;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import android.view.View.OnClickListener;
import android.util.Size;
import android.text.style.TypefaceSpan;
import android.graphics.fonts.FontStyle;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.lang.Process;
import java.nio.file.Paths;
import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import android.os.Environment;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

import android.content.res.AssetManager;

//////////////////////////////////////
import com.justinhuman.Cradit_Jagdish;

import android.app.Service;
import android.os.IBinder;
//import android.content.Intent;
//import android.os.PowerManager;
//import android.annotation.SuppressLint;
import android.content.Context;
//import android.view.View;
//import android.view.LayoutInflater;
//import android.view.WindowManager;
//import android.view.WindowManager.LayoutParams;
import android.os.Build;
//import android.graphics.PixelFormat;
//import android.view.Gravity;
//import android.util.DisplayMetrics;
//import android.widget.LinearLayout;
//import android.widget.ImageView;
//import android.view.View.OnClickListener;
//import android.view.View.OnTouchListener;
//import android.view.MotionEvent;
//import android.widget.RelativeLayout;

import android.widget.RadioGroup;
import java.io.*;
import java.io.InputStream;




public class Floating extends Service {
   // final LinearLayout[] contentLayouts;
    float density;
    int dpi;
    RelativeLayout g_iconLayout;
    LinearLayout g_mainLayout;
   // final LinearLayout[] layoutParents;
    boolean resetAvailable;
    int scanThread;
    int screenHeight;
    int screenWidth;
    int CheckAttY;
   // ESPView espLayout;
    SharedPreferences configPrefs;
    static Context ctx;
   // final ScrollView[] scrollLayouts;
    int selectedTab;
   // final FrameLayout[] tabLayouts;
    int type;
    LinearLayout linearLayout_page_Bypass;
    LinearLayout linearLayout_page_Esp;
    LinearLayout linearLayout_page_Vehicles;
    LinearLayout linearLayout_bypass;
    LinearLayout linearLayout_tabBypass;
    LinearLayout linearLayout_tabvehicles;
    LinearLayout linearLayout_page_Memoryzy;
    LinearLayout linearLayout_page_1,
    linearLayout_page_2,
    linearLayout_page_5;
    RelativeLayout closeLayout;
    private ScrollView 
    scrollView1,
    scrollView2,
    scrollView3,
    scrollView4;
    
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9;
    WindowManager windowManager;
    static boolean execs = false;
    static boolean count = false;
    private RelativeLayout relativeLayout;
    
    
   // final String[] TABS;
Button button1,button2,button3,button4;
float mediumSize = 5.0f;
int ToggleON = Color.GREEN;
int ToggleOFF = Color.LTGRAY;
RelativeLayout relativeLayout2;
RelativeLayout relativeLayout3;
boolean lockBulletMode;
    boolean BulletMode;
    boolean BulletTrick;
    boolean lockFightMode;
    boolean fightMode;
    boolean Onclick;
    boolean Onclickjk;
    boolean BypassMain;
    boolean BypassBullet;
    boolean Esp;
    static boolean isBullet;
    boolean lockfight_mode = false;
    boolean lockBullet_mode = false;
    boolean fight_mode = false;
    boolean Bullet_mode = false;
    Boolean Manager;


    
        private void FightFloat() {
        relativeLayout2 = new RelativeLayout(this);
        relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        relativeLayout2.setAlpha(0.6f);
        ImageView imageView2 = new ImageView(this);
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(80, 80));
        relativeLayout2.addView(imageView2);

        try {
            InputStream inputStream = getApplicationContext().getAssets().open("FoxEngine/helper.dat");
            byte[] buffer = new byte[1024];
            int bytesRead;
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            byte[] icon = output.toByteArray();

            Bitmap bmp = BitmapFactory.decodeByteArray(icon, 0, icon.length);
            imageView2.setImageBitmap(bmp);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        final WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(-2, -2, this.type, 8, -3);
        layoutParams3.gravity = 51;
        layoutParams3.x = 0;
        layoutParams3.y = 0;
        relativeLayout2.setVisibility(8);
        this.windowManager.addView(relativeLayout2, layoutParams3);
        relativeLayout2.setOnTouchListener(new View.OnTouchListener() {
                float deltaX;
                float deltaY;
                float newX;
                float newY;
                float pressedX;
                float pressedY;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        this.deltaX = ((float) layoutParams3.x) - motionEvent.getRawX();
                        this.deltaY = ((float) layoutParams3.y) - motionEvent.getRawY();
                        this.pressedX = motionEvent.getRawX();
                        this.pressedY = motionEvent.getRawY();
                    } else if (actionMasked == 1) {
                        int rawX = (int) (motionEvent.getRawX() - this.pressedX);
                        int rawY = (int) (motionEvent.getRawY() - this.pressedY);
                        if (rawX == 0 && rawY == 0) {
                            Floating Floating = Floating.this;
                            Floating.fightMode = !Floating.fightMode;
                            if (Floating.this.fightMode) {
                                Toast.makeText(Floating.this, "Fight Mode Enabled!", 0).show();
                            } else {
                                Toast.makeText(Floating.this, "Fight Mode Disabled!", 0).show();
                            }
                            Floating Floating2 = Floating.this;
                            //Floating2.UpdateConfiguration("FIGHT_MODE", Integer.valueOf(Floating2.fightMode ? 1 : 0));
                        }
                        return true;
                    } else if (actionMasked == 2) {
                        this.newX = motionEvent.getRawX() + this.deltaX;
                        this.newY = motionEvent.getRawY() + this.deltaY;
                        float width = (float) (Floating.this.screenWidth - view.getWidth());
                        float height = (float) (Floating.this.screenHeight - view.getHeight());
                        if (this.newX < 0.0f) {
                            this.newX = 0.0f;
                        }
                        if (this.newX > width) {
                            this.newX = (float) ((int) width);
                        }
                        if (this.newY < 0.0f) {
                            this.newY = 0.0f;
                        }
                        if (this.newY > height) {
                            this.newY = (float) ((int) height);
                        }
                        if (!Floating.this.lockFightMode) {
                            layoutParams3.x = (int) this.newX;
                            layoutParams3.y = (int) this.newY;
                            Floating.this.windowManager.updateViewLayout(relativeLayout2, layoutParams3);
                        }
                    }
                    return false;
                }
            });
    }
    
    

private void BulletFloat() {
        relativeLayout3 = new RelativeLayout(this);
        relativeLayout3.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        relativeLayout3.setAlpha(0.6f);
        ImageView imageView3 = new ImageView(this);
        imageView3.setLayoutParams(new ViewGroup.LayoutParams(80, 80));
        relativeLayout3.addView(imageView3);

        try {
            InputStream inputStream = getApplicationContext().getAssets().open("FoxEngine/helper.dat");
            byte[] buffer = new byte[1024];
            int bytesRead;
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            byte[] icon = output.toByteArray();

            Bitmap bmp = BitmapFactory.decodeByteArray(icon, 0, icon.length);
            imageView3.setImageBitmap(bmp);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        final WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(-2, -2, this.type, 8, -3);
        layoutParams4.gravity = 51;
        layoutParams4.x = 0;
        layoutParams4.y = 0;
        relativeLayout3.setVisibility(8);
        this.windowManager.addView(relativeLayout3, layoutParams4);
        relativeLayout3.setOnTouchListener(new View.OnTouchListener() {
                float deltaX;
                float deltaY;
                float newX;
                float newY;
                float pressedX;
                float pressedY;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        this.deltaX = ((float) layoutParams4.x) - motionEvent.getRawX();
                        this.deltaY = ((float) layoutParams4.y) - motionEvent.getRawY();
                        this.pressedX = motionEvent.getRawX();
                        this.pressedY = motionEvent.getRawY();
                    } else if (actionMasked == 1) {
                        int rawX = (int) (motionEvent.getRawX() - this.pressedX);
                        int rawY = (int) (motionEvent.getRawY() - this.pressedY);
                        if (rawX == 0 && rawY == 0) {
                            Floating Floating = Floating.this;
                            Floating.BulletMode = !Floating.BulletMode;
                            if (Floating.this.BulletMode) {
                                Toast.makeText(Floating.this, "Fight Mode Enabled!", 0).show();
                            } else {
                                Toast.makeText(Floating.this, "Fight Mode Disabled!", 0).show();
                            }
                            Floating Floating2 = Floating.this;
                            //Floating2.UpdateConfiguration("FIGHT_MODE", Integer.valueOf(Floating2.BulletMode ? 1 : 0));
                        }
                        return true;
                    } else if (actionMasked == 2) {
                        this.newX = motionEvent.getRawX() + this.deltaX;
                        this.newY = motionEvent.getRawY() + this.deltaY;
                        float width = (float) (Floating.this.screenWidth - view.getWidth());
                        float height = (float) (Floating.this.screenHeight - view.getHeight());
                        if (this.newX < 0.0f) {
                            this.newX = 0.0f;
                        }
                        if (this.newX > width) {
                            this.newX = (float) ((int) width);
                        }
                        if (this.newY < 0.0f) {
                            this.newY = 0.0f;
                        }
                        if (this.newY > height) {
                            this.newY = (float) ((int) height);
                        }
                        if (!Floating.this.lockBulletMode) {
                            layoutParams4.x = (int) this.newX;
                            layoutParams4.y = (int) this.newY;
                            Floating.this.windowManager.updateViewLayout(relativeLayout3, layoutParams4);
                        }
                    }
                    return false;
                }
            });
    }



 
    void AddText1(String text, float size, int color) {
        TextView textView = new TextView(this);
        textView.setText(text);
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        textView.setTypeface(face);
        textView.setTextColor(color);
        textView.setPadding(15, 15, 15, 15);
        textView.setTextSize(convertSizeToDp(size));
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout_page_Memoryzy.addView(textView);
       
            
    }
	void AddText(Object data, String text, float size, int color) {
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setTextColor(color);
        textView.setPadding(15, 15, 15, 15);
        textView.setTextSize(convertSizeToDp(size));
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (data instanceof Integer)
            linearLayout_page_Bypass.addView(textView);
        else if (data instanceof ViewGroup)
            ((ViewGroup) data).addView(textView);
    }
	void AddTextJK(Object data, String text, float size, int color) {
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setTextColor(color);
        textView.setPadding(15, 15, 15, 15);
        textView.setTextSize(convertSizeToDp(size));
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (data instanceof Integer)
            linearLayout_page_Memoryzy.addView(textView);
        else if (data instanceof ViewGroup)
            ((ViewGroup) data).addView(textView);
    }


    void AddText3(String text, float size, int color) {
        TextView textView = new TextView(this);
        textView.setText(text);
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        textView.setTypeface(face);
        textView.setTextColor(color);
        textView.setPadding(15, 15, 15, 15);
        textView.setTextSize(convertSizeToDp(size));
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout_page_Bypass.addView(textView);


    }


    
    
    
    void AddSwitch(Object data, String text, boolean checked, CompoundButton.OnCheckedChangeListener listener) {
        Switch switch_ = new Switch((Context)this);
        switch_.setText(text);
        switch_.setTextColor(-1);
        switch_.setTextSize(13);
        switch_.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/11.ttf"));
        switch_.setPadding(4, 4, 4, 4);
        switch_.setOnCheckedChangeListener(listener);
        switch_.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        ColorStateList buttonStates = new ColorStateList(
            new int[][]{
                new int[]{-android.R.attr.state_enabled},
                new int[]{android.R.attr.state_checked},
                new int[]{}
            },
            new int[]{
                Color.BLUE,
                Color.parseColor("#e81515"),
                Color.parseColor("#ECECEC")
            }
        );
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            switch_.getThumbDrawable().setTintList(buttonStates);
            switch_.getTrackDrawable().setTintList(buttonStates);
        }
        if (data instanceof Integer)
            linearLayout_page_Bypass.addView(switch_);
        else if (data instanceof ViewGroup)
            ((ViewGroup) data).addView(switch_);

    }
    
    void AddSwitch3(Object data, String text, boolean checked, CompoundButton.OnCheckedChangeListener listener) {
        Switch switch_ = new Switch((Context)this);
        switch_.setText(text);
        switch_.setTextColor(-1);
        switch_.setTextSize(13);
        switch_.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/11.ttf"));
        switch_.setPadding(4, 4, 4, 4);
        switch_.setOnCheckedChangeListener(listener);
        switch_.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        ColorStateList buttonStates = new ColorStateList(
            new int[][]{
                new int[]{-android.R.attr.state_enabled},
                new int[]{android.R.attr.state_checked},
                new int[]{}
            },
            new int[]{
                Color.BLUE,
                Color.parseColor("#e81515"),
                Color.parseColor("#ECECEC")
            }
        );
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            switch_.getThumbDrawable().setTintList(buttonStates);
            switch_.getTrackDrawable().setTintList(buttonStates);
        }
        if (data instanceof Integer)
            linearLayout_page_Memoryzy.addView(switch_);
        else if (data instanceof ViewGroup)
            ((ViewGroup) data).addView(switch_);

    }
    /*
    
    void AddSwitch3(Object object,String string, boolean bl, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/erroldec.ttf");

        Switch switch_ = new Switch(this);
        GradientDrawable thumbdraw = new GradientDrawable();
        thumbdraw.setCornerRadius((float)20);
        thumbdraw.setStroke(3, Color.parseColor("#00FF00"));
        thumbdraw.setColor(Color.parseColor("#FF0000"));
        thumbdraw.setSize(50, 50);
        GradientDrawable trackdraw = new GradientDrawable();
        trackdraw.setColor(-4);
        trackdraw.setStroke(3, Color.parseColor("#FD00FE"));
        trackdraw.setSize(60, 50);
        trackdraw.setCornerRadius((float)20);
        switch_.setText((CharSequence)string);
        switch_.setPadding(10, 10, 10, 10);
        switch_.setTypeface(typeface);
        switch_.setTextSize(1, 12.5f);
        switch_.setTextColor(-1);
        switch_.setOnCheckedChangeListener(onCheckedChangeListener);
        switch_.setThumbDrawable(thumbdraw);
        switch_.setTrackDrawable(trackdraw);
        switch_.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
        if (object instanceof Integer)
            linearLayout_page_Memoryzy.addView(switch_);
        else if (object instanceof ViewGroup)
            ((ViewGroup) object).addView(switch_);
    }
*/
    
    void AddSwitchItems(Object object, final String Class, String text, String text1, final int itemId, final int itemId2) {
        final LinearLayout headerLayout = new LinearLayout(this);
        headerLayout.setOrientation(0);
        headerLayout.setGravity(Gravity.LEFT);
        LinearLayout.LayoutParams layparam = new LinearLayout.LayoutParams(-1, -2);
        layparam.gravity = Gravity.CENTER_HORIZONTAL;
        headerLayout.setLayoutParams(layparam);

        CheckBox checkBox = new CheckBox((Context)this);
        checkBox.setText((CharSequence)text);
        checkBox.setTextColor(Color.GREEN);
        checkBox.setTextSize(13);
        //checkBox.setCheckBoxColor, Color.parseColor("#ffffff"), Color.parseColor("#3793C2"));
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/erroldec.ttf"); 
        checkBox.setTypeface(type);
        LinearLayout.LayoutParams layparam2 = new LinearLayout.LayoutParams(-2, -2);
        checkBox.setLayoutParams(layparam2);

        CheckBox checkBox2 = new CheckBox((Context)this);
        checkBox2.setText((CharSequence)text1);
        checkBox2.setTextColor(Color.GREEN);
        checkBox2.setTypeface(type);
        checkBox2.setTextSize(13);
    //  setCheckBoxColor(checkBox2, Color.parseColor("#ffffff"), Color.parseColor("#3793C2"));
        checkBox2.setLayoutParams(layparam2);

        headerLayout.addView(checkBox);
        if (Integer.valueOf(itemId2) != 99999) {
            headerLayout.addView(checkBox2);
        }
        if (object instanceof Integer)
            linearLayout_page_1.addView(headerLayout);
        else if (object instanceof ViewGroup)
            ((ViewGroup) object).addView(headerLayout);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    UpdateConfiguration(Class, Integer.valueOf(itemId));
                }
            });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    UpdateConfiguration(Class, Integer.valueOf(itemId2));
                }
            });
    }
    
    void AddSeekbar(Object object, String string, final int n, int n2, int n3, final String string2, final String string3, final SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        int n4 = n3;
        LinearLayout linearLayout = new LinearLayout((Context)this);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        TextView textView = new TextView((Context)this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(":");
        textView.setText((CharSequence)stringBuilder.toString());
        textView.setTextSize(1, 12.5f);
        textView.setPadding(this.convertSizeToDp(10.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(10.0f), this.convertSizeToDp(5.0f));
        textView.setTextColor(Color.GREEN);
        textView.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-2, -2));
        textView.setGravity(3);
        SeekBar seekBar = new SeekBar((Context)this);
        seekBar.setMax(n2);
        if (Build.VERSION.SDK_INT >= 26) {
            seekBar.setMin(n);
            seekBar.setProgress(n);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            seekBar.setThumbTintList(ColorStateList.valueOf((int)Color.BLUE));
            seekBar.setProgressTintList(ColorStateList.valueOf((int)Color.GREEN));
        }
        seekBar.setPadding(this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f));
        final TextView textView2 = new TextView((Context)this);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string2);
        stringBuilder2.append(n);
        stringBuilder2.append(string3);
        textView2.setText((CharSequence)stringBuilder2.toString());
        textView2.setGravity(5);
        textView2.setTextSize(1, 12.5f);
        textView2.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
        textView2.setPadding(this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f));
        textView2.setTextColor(Color.BLUE);
        if (n4 != 0) {
            if (n4 < n) {
                n4 = n;
            }
            if (n4 > n2) {
                n4 = n2;
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string2);
            stringBuilder3.append(n4);
            stringBuilder3.append(string3);
            textView2.setText((CharSequence)stringBuilder3.toString());
            seekBar.setProgress(n4);
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = new SeekBar.OnSeekBarChangeListener(){

            public void onProgressChanged(SeekBar seekBar, int n2, boolean bl) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2;
                if (n2 < n) {
                    n2 = n;
                    seekBar.setProgress(n2);
                }
                if ((onSeekBarChangeListener2 = onSeekBarChangeListener) != null) {
                    onSeekBarChangeListener2.onProgressChanged(seekBar, n2, bl);
                }
                TextView textView = textView2;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(n2);
                stringBuilder.append(string3);
                textView.setText((CharSequence)stringBuilder.toString());
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
                if (onSeekBarChangeListener2 != null) {
                    onSeekBarChangeListener2.onStartTrackingTouch(seekBar);
                }
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
                if (onSeekBarChangeListener2 != null) {
                    onSeekBarChangeListener2.onStopTrackingTouch(seekBar);
                }
            }
        };
        seekBar.setOnSeekBarChangeListener(onSeekBarChangeListener2);
        linearLayout.addView((View)textView);
        linearLayout.addView((View)textView2);
        if (object instanceof ViewGroup) {
            ((ViewGroup)object).addView((View)linearLayout);
            ((ViewGroup)object).addView((View)seekBar);
            return;

        }
        if (object instanceof Integer) {
            linearLayout_page_Bypass.addView((View)linearLayout);
            linearLayout_page_Bypass.addView((View)seekBar);
        }
    }
    /*
    seekBar.setOnSeekBarChangeListener(onSeekBarChangeListener2);
    linearLayout.addView((View)textView);
    linearLayout.addView((View)textView2);
    linearLayout_page_Memory.addView(linearLayout);
    linearLayout_page_Memory.addView(seekBar);
    */

    void AddRadioButton(Object object, String[] arrstring, int n, RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        RadioGroup radioGroup = new RadioGroup((Context)this);
        radioGroup.setOrientation(1);
        RadioButton[] arrradioButton = new RadioButton[arrstring.length];
        for (int i = 0; i < arrstring.length; ++i) {
            arrradioButton[i] = new RadioButton((Context)this);
            if (i == n) {
                arrradioButton[i].setChecked(true);
            }
            arrradioButton[i].setPadding(this.convertSizeToDp(10.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(10.0f), this.convertSizeToDp(5.0f));
            arrradioButton[i].setText((CharSequence)arrstring[i]);
            arrradioButton[i].setTextSize(1, 12.5f);
            Typeface type = Typeface.createFromAsset(getAssets(), "fonts/erroldec.ttf"); 
            arrradioButton[i].setTypeface(type);
            arrradioButton[i].setId(i);
            arrradioButton[i].setGravity(Gravity.CENTER_VERTICAL);
            arrradioButton[i].setTextColor(-1);
            setRadioButtonColor(arrradioButton[i], Color.parseColor("#FD00FE"), Color.parseColor("#00FF00"));
            radioGroup.addView((View)arrradioButton[i]);
        }
        radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        radioGroup.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
        if (object instanceof Integer)
            linearLayout_page_Bypass.addView(radioGroup);
        else if (object instanceof ViewGroup)
            ((ViewGroup) object).addView(radioGroup);
    }

    public void setRadioButtonColor(RadioButton checkBox, int uncheckedColor, int checkedColor) {
        ColorStateList colorStateList = new ColorStateList(new int[][] {new int[] { -android.R.attr.state_checked }, new int[] {  android.R.attr.state_checked}}, new int[] {uncheckedColor, checkedColor});
        checkBox.setButtonTintList(colorStateList);
    }
    
    
    
    
    int convertSizeToDp(float f) {
        return Math.round((float)TypedValue.applyDimension((int)1, (float)f, (DisplayMetrics)this.getResources().getDisplayMetrics()));
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
    
    
    
    
    void setFps(int fps){
        SharedPreferences sp=this.getSharedPreferences("espValue",Context.MODE_PRIVATE);
        SharedPreferences.Editor ed= sp.edit();
        ed.putInt("fps",fps);
        ed.apply();
    }

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
    
    
    
    static boolean getConfig(String key){
        SharedPreferences sp=ctx.getSharedPreferences("espValue",Context.MODE_PRIVATE);
        return  sp.getBoolean(key,false);
    }
    

        public void onCreate() {
        super.onCreate();
        loadAssets(); 
            System.loadLibrary("pubgm");
			FileUtil.writeFile("/storage/emulated/0/JAGDISH_VIP.txt", "64 BIT APK");
        ctx=this;
        configPrefs = getSharedPreferences("config", MODE_PRIVATE);     
        final LinearLayout linearLayout;
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        final Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        screenWidth = point.x;
        screenHeight = point.y;
        dpi = Resources.getSystem().getDisplayMetrics().densityDpi;
        density = Resources.getSystem().getDisplayMetrics().density;
        final int n = convertSizeToDp(360.0f);
        final int n2 = convertSizeToDp(280.0f);
        g_mainLayout = linearLayout = new LinearLayout((Context)this);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setPadding(5,0,5,0);  
        GradientDrawable gradientDrawable1= new GradientDrawable();
        gradientDrawable1.setColor(Color.parseColor("#FF000000"));
        gradientDrawable1.setCornerRadius(4.0f);
        linearLayout.setBackground(gradientDrawable1);
        Integer n3 = 1;
        linearLayout.setOrientation(1);
        int n4 = convertSizeToDp(32.0f);
        final LinearLayout frameLayout = new LinearLayout(this);
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(true);
        frameLayout.setOrientation(0);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, n4));
        
			GradientDrawable gradientDrawable2= new GradientDrawable();
			gradientDrawable2.setColor(Color.parseColor("#00000000"));
			gradientDrawable2.setStroke(3, Color.parseColor("#FFFFFF00"));
			gradientDrawable2.setCornerRadius(3.0f);  
			frameLayout.setBackground(gradientDrawable2); 
			linearLayout.addView(frameLayout);
			TextView textView = new TextView(this);
			Typeface face1 = Typeface.createFromAsset(getAssets(), "pubg.ttf");
			// textView.setText("GODL CHEATS BT SERVER");//        (MODNAME());
			textView.setText (MODNAME());
			textView.setGravity(Gravity.CENTER);
			textView.setTextColor(Color.parseColor("#FFFFFFFF"));
			textView.setTypeface(face1);
			textView.setPadding(convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f));
			textView.setTextSize(1, 20.0f);
			frameLayout.addView(textView);
            
        
             /*
           
        Button button = new Button((Context)this);
        GradientDrawable buttonBG =  new GradientDrawable();
        button.setPadding(this.convertSizeToDp(4.0f), 0, 0, 0);
        button.setText("✕");
        button.setGravity(8);
	    button.setTextColor(Color.parseColor("#FF80F636"));
        button.setTextSize(1,20.0f);
        button.setWidth(0);
        LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams1.setMargins(400, -1, 1, -1);
        button.setLayoutParams(layoutParams1);
        button.setGravity(Gravity.RIGHT);
        button.setGravity(Gravity.VERTICAL_GRAVITY_MASK);
        button.setBackground(buttonBG);
        frameLayout.addView((View)button);
           */
        


        final LinearLayout linearLayout1 = new LinearLayout(this);
        linearLayout1.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout1.setBackgroundColor(Color.parseColor("#FF000000"));
        linearLayout1.setOrientation(0);
        linearLayout.addView(linearLayout1);
        
        //tab_home
        int n7 = convertSizeToDp(1.0f);
        final LinearLayout linearLayout_tabHome = new LinearLayout(this);
        linearLayout_tabHome.setLayoutParams(new LinearLayout.LayoutParams(n7, -1));
            linearLayout_tabHome.setBackgroundColor(Color.parseColor("#FF000000"));
        linearLayout_tabHome.setOrientation(1);
        linearLayout1.addView(linearLayout_tabHome);
        
        this.scrollView1 = new ScrollView((Context)this);
        this.scrollView1.setLayoutParams(new ScrollView.LayoutParams(-1,-1));
       // this.scrollView1.setOrientation(1);
        linearLayout_tabHome.addView(scrollView1);
        
        final LinearLayout linearLayout_tabHomeup = new LinearLayout(this);
        linearLayout_tabHomeup.setLayoutParams(new LinearLayout.LayoutParams(n7, -1));
        linearLayout_tabHomeup.setBackgroundColor(Color.parseColor("#FDC400"));
        linearLayout_tabHomeup.setOrientation(1);
        scrollView1.addView(linearLayout_tabHomeup);
        
        //page_home
        final LinearLayout linearLayout_pageHome = new LinearLayout(this);
        linearLayout_pageHome.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_pageHome.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_pageHome.setOrientation(0);
        linearLayout1.addView(linearLayout_pageHome);
        
            //linearLayout_BypassJK
            int GG1 = convertSizeToDp(170.0f);
            
            int GG3 = convertSizeToDp(248.0f);
            final LinearLayout linearLayout_BypassJK = new LinearLayout(this);
            linearLayout_BypassJK.setLayoutParams(new LinearLayout.LayoutParams(GG1, GG3));
            linearLayout_BypassJK.setBackgroundColor(Color.parseColor("#16000000"));
            linearLayout_BypassJK.setOrientation(1);
            linearLayout_pageHome.addView(linearLayout_BypassJK);
            
            //linearLayout_BypassJK
            final LinearLayout linearLayout_BypassJKPAP = new LinearLayout(this);
            linearLayout_BypassJKPAP.setLayoutParams(new LinearLayout.LayoutParams(10, GG3));
            linearLayout_BypassJKPAP.setBackgroundColor(Color.parseColor("#FF000000"));
            linearLayout_BypassJKPAP.setOrientation(1);
            linearLayout_pageHome.addView(linearLayout_BypassJKPAP);
            
        
         //page_bypass_base
        
        final LinearLayout linearLayout_Bypass = new LinearLayout(this);
            linearLayout_Bypass.setLayoutParams(new LinearLayout.LayoutParams(-1, GG3));
            linearLayout_Bypass.setBackgroundColor(Color.parseColor("#16000000"));
        linearLayout_Bypass.setOrientation(1);
        linearLayout_pageHome.addView(linearLayout_Bypass);
        
        
           
        
        this.scrollView2 = new ScrollView((Context)this);
        this.scrollView2.setLayoutParams(new ScrollView.LayoutParams(-1,-1));
        linearLayout_Bypass.addView(scrollView2);
        
        this.scrollView3 = new ScrollView((Context)this);
        this.scrollView3.setLayoutParams(new ScrollView.LayoutParams(-1,-1));
            linearLayout_BypassJK.addView(scrollView3);
        
        
        this.scrollView4 = new ScrollView((Context)this);
        this.scrollView4.setLayoutParams(new ScrollView.LayoutParams(-1,-1));
            linearLayout_BypassJKPAP.addView(scrollView4);
        
            
        
        //page_bypass
        this.linearLayout_page_Bypass = new LinearLayout(this);
        linearLayout_page_Bypass.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_page_Bypass.setBackgroundColor(Color.parseColor("#181818"));
        linearLayout_page_Bypass.setOrientation(1);
        linearLayout_page_Bypass.setPadding(8,10,8,8);
        linearLayout_page_Bypass.setGravity(Gravity.CENTER);
        scrollView2.addView(linearLayout_page_Bypass);
        
 
        //page_bypass
            this.linearLayout_page_Memoryzy = new LinearLayout(this);
            linearLayout_page_Memoryzy.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout_page_Memoryzy.setBackgroundColor(Color.parseColor("#181818"));
            linearLayout_page_Memoryzy.setOrientation(1);
            linearLayout_page_Memoryzy.setPadding(8,10,8,8);
            linearLayout_page_Memoryzy.setGravity(Gravity.CENTER);
            scrollView3.addView(linearLayout_page_Memoryzy);

        
        
        //page_esp
        this.linearLayout_page_Esp = new LinearLayout(this);
        linearLayout_page_Esp.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout_page_Esp.setBackgroundColor(Color.parseColor("#181818"));
        linearLayout_page_Esp.setOrientation(1);
        linearLayout_page_Esp.setPadding(8,8,8,8);
        scrollView4.addView(linearLayout_page_Esp);
        
        
        
       
        this.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        
         
        final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(n, n2, this.type, 520, -3);
        layoutParams.x = 280;//150
        layoutParams.y = 100;//150
        layoutParams.gravity = 51;
        frameLayout.setOnTouchListener(new View.OnTouchListener(){
                float deltaX;
                float deltaY;
                float maxX;
                float maxY;
                float newX;
                float newY;
                float pressedX;
                float pressedY;
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    float f,f2,f3,f4;
                    int n = motionEvent.getActionMasked();
                    if (n == 0) {
                        this.deltaX = (float)layoutParams.x - motionEvent.getRawX();
                        this.deltaY = (float)layoutParams.y - motionEvent.getRawY();
                        this.pressedX = motionEvent.getRawX();
                        this.pressedY = motionEvent.getRawY();
                        return false;
                    }
                    if (n != 1) {
                        float f5;
                        float f6;
                        if (n != 2) {
                            return false;
                        }
                        this.newX = motionEvent.getRawX() + deltaX;
                        this.newY = motionEvent.getRawY() + deltaY;
                        this.maxX = point.x - linearLayout.getWidth();
                        this.maxY = f6 = (point.y - linearLayout.getHeight());
                        float f7 = newX;
                        if (!(f7 < 0.0f || f7 > maxX || (f5 = newY) < 0.0f || f5 > f6)) {
                            linearLayout.setAlpha(1.0f);
                        } else {
                            linearLayout.setAlpha(0.5f);
                        }
                        layoutParams.x = (int)newX;
                        layoutParams.y = (int)newY;
                        windowManager.updateViewLayout(linearLayout,layoutParams);
                        return false;
                    }
                    maxX = point.x - linearLayout.getWidth();
                    maxY = point.y - linearLayout.getHeight();
                    if (newX < 0.0f) {
                        newX = 0.0f;
                    }
                    if ((f = newX) > (f4 = maxX)) {
                        newX = f4;
                    }
                    if (newY < 0.0f) {
                        newY = 0.0f;
                    }
                    if ((f3 = newY) > (f2 = maxY)) {
                        newY = (int)f2;
                    }
                    layoutParams.x = (int)newX;
                    layoutParams.y = (int)newY;
                    windowManager.updateViewLayout(linearLayout,layoutParams);
                    linearLayout.setAlpha(1.0f);
                    return true;
                }
            });
            
         

       

        this.g_iconLayout = relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(this);
        setImageFromAssets(imageView, "Icon.png");
         g_iconLayout.addView((View)imageView, convertSizeToDp(60.0f), convertSizeToDp(60.0f));
        
        //ImageView imageView = new ImageView(this);
        //imageView.setLayoutParams(new ViewGroup.LayoutParams(convertSizeToDp(60.0f), convertSizeToDp(60.0f)));
       // relativeLayout.addView((View)imageView);
     // byte[] arrby = Base64.decode(Icon(),0); 
       // imageView.setImageBitmap(BitmapFactory.decodeByteArray(arrby,0,arrby.length));
        final WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2,type, 8, -3);
        layoutParams2.gravity = 51;
        layoutParams2.x = 0;
        layoutParams2.y = 0;
        relativeLayout.setVisibility(8);
        windowManager.addView(relativeLayout,layoutParams2);
        windowManager.addView(linearLayout,layoutParams);
        relativeLayout.setOnTouchListener(new View.OnTouchListener(){
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
                            linearLayout.setVisibility(0);
                            relativeLayout.setVisibility(8);
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
            
      /*  ColseImg.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    linearLayout.setVisibility(8);
                    relativeLayout.setVisibility(0);
                }
            });*/
	    textView.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    linearLayout.setVisibility(8);
                    relativeLayout.setVisibility(0);
                }
            });
            
            
          


        DrawCanvas();
        
     
            AddText1( "VISUAL MENU", 6.2f,  Color.GREEN);
		 	AddTextJK(0, keyexe22()+keyexe(), 6.0f, Color.CYAN);  
            AddSwitch3(0,"LINE", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {                
                        //SettingValue(1,isChecked);
                        UpdateConfiguration("ESP::LINE", isChecked ? 1 : 0);
                    }
                });
            AddSwitch3(0,"BOX", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //SettingValue(2,isChecked);
                        UpdateConfiguration("ESP::BOX", isChecked ? 1 : 0);
                    }
                });
			AddSwitch3(0,"NAME", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //SettingValue(5,isChecked);
                        UpdateConfiguration("ESP::NAME", isChecked ? 1 : 0);
                    }
                });
            AddSwitch3(0,"SKELETON", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //SettingValue(3,isChecked);
                        UpdateConfiguration("ESP::SKELETON", isChecked ? 1 : 0);
                    }
                });
            AddSwitch3(0,"HEALTH", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //SettingValue(4,isChecked);
                        UpdateConfiguration("ESP::HEALTH", isChecked ? 1 : 0);
                    }
                });
            
            AddSwitch3(0,"DISTANCE", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //SettingValue(7,isChecked);
                        UpdateConfiguration("ESP::DISTANCE", isChecked ? 1 : 0);
                    }
                });
		/*	AddSwitch3(0, "360° ALERT", false, new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
						UpdateConfiguration("ESP::360ALERT", isChecked ? 1 : 0);
						// UpdateConfiguration("ESP::ONSCREENALERT", isChecked ? 1 : 0);
					}
				});*/
			AddSwitch3(0,"LOOTBOX", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //UpdateConfiguration("MEMORY::INSTANT_HIT", Byte.parseByte(String.valueOf(isChecked ? 1 : 0)));
                    //    UpdateConfiguration("ESP::DEADBOX", isChecked ? 1 : 0);
                        UpdateConfiguration("ESP::LOOTBOX", isChecked ? 1 : 0);
                    }
                });/*
			AddSwitch3(0,"BOX ITEMS", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //UpdateConfiguration("MEMORY::INSTANT_HIT", Byte.parseByte(String.valueOf(isChecked ? 1 : 0)));
                        UpdateConfiguration("ESP::DEADBOXITEMS", isChecked ? 1 : 0);
                    }
                });*/
			
            AddSwitch3(0,"VEHICLE", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                        UpdateConfiguration("ESP::VEHICLE", isChecked ? 1 : 0);
                    }
                });
            

            AddSwitch3(0,"GRENADE", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //SettingValue(9,isChecked);
                        UpdateConfiguration("ESP::WARNING", isChecked ? 1 : 0);
                    }
                });
                
             AddText3( "AIM MENU", 6.2f,  Color.GREEN);
			 AddText(0, SLOT(), 6.0f, Color.CYAN);  
			AddSwitch(2, "PROTECTION+", false, new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

			            FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/cache");
						//FileUtil.deleteFile("/storage/emulated/0/AppProjects/Jagdish.h");
						FileUtil.deleteFile("/storage/emulated/0/JKPAPA/Jagdish.h");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/ca-bundle.pem");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/cacheFile.txt");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/log");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/login-identifier.txt");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/LightData");						
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/PufferEifs0");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/PufferEifs1");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/PufferTmpDir");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/UpdateInfo");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/GameErrorNoRecords");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/SrcVersion.ini");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/StatEventReportedFlag");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/TableDatas");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Avatar");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json");						
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileListAddtional.json");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp");			
						//FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_2.5.0.17327.pak");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_2.5.0.17328.pak");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_2.5.0.17329.pak");
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_2.5.0.17330.pak");				
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_2.5.0.17331.pak");				
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_2.5.0.17332.pak");				
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_2.5.0.17333.pak");	
						FileUtil.deleteFile("/storage/emulated/0/Android/data/com.pubg.imobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_2.5.0.17334.pak");				
						FileUtil.writeFile("/storage/emulated/0/Android", "TELEGRAM CHANNEL: https://t.me/+tUtdawpz7U02ZDc1");
						Toast.makeText(getApplicationContext(), "PROTECTION RUNNING", Toast.LENGTH_SHORT).show(); 


					}
				});
            /*
            AddSwitch(2,"ESP HIDE RECORDING", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if(isChecked){       
                            hiderec_s = 1;
                        }else{
                            hiderec_s = 0;
                        }
                    }

                });
             
             */
			AddSwitch(2,"Magic Bullet", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
						UpdateConfiguration("MAGIC::BULLET", isChecked ? 1 : 0);

                    }
                });
            AddSwitch(2,"Enable", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if(isChecked){
                            startService(new Intent(getApplicationContext(),bullet.class));
                            isBullet = true;
                        } else {
                            stopService(new Intent(getApplicationContext(),bullet.class));
                            isBullet = false;   
                        }
                        //UpdateConfiguration("HACK::ENABLE", isChecked ? 1 : 0);           
                    }
                });


            AddRadioButton(2, new String[]{"Aimbot"/*,"Silent Aim"*/}, 0, new RadioGroup.OnCheckedChangeListener(){
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        UpdateConfiguration("HACK::TYPE", i);
                    }
                });


            int fov  =0;
            AddSeekbar(2, "FOV", 0, 500, fov, "", "", new SeekBar.OnSeekBarChangeListener(){
                    public void onProgressChanged(SeekBar seekBar, int n, boolean isChecked) {
                        UpdateConfiguration("FOV::SIZE",n);
                    }
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }); 
			AddSwitch(2,"Recoil Compensation", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					    UpdateConfiguration("RECOIL::COMP",n);

                    }
                });
            
			int RECOIL  =0;
            AddSeekbar(2, "RECOIL SIZE", 0, 4, RECOIL, "", "", new SeekBar.OnSeekBarChangeListener(){
                    public void onProgressChanged(SeekBar seekBar, int n, boolean isChecked) {
                        UpdateConfiguration("RECOIL::SIZE",n);
                    }
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }); 
            /*
             AddText3( "AIM TARGET", 6.2f,  Color.WHITE);
             AddRadioButton(2, new String[]{"Shortest Distance", "FOV"}, 0, new RadioGroup.OnCheckedChangeListener(){
             public void onCheckedChanged(RadioGroup radioGroup, int i) {
             UpdateConfiguration("AIM::TARGET", i);
             }
             });
             */
            AddText3("AIM TARGET", 6.2f,  Color.WHITE);
            AddRadioButton(2, new String[]{"Head", "Body"}, 0, new RadioGroup.OnCheckedChangeListener(){
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        UpdateConfiguration("AIM::AIMPOS", i);
                    }
                });
            AddText3( "TRIGIGER TYPE", 6.2f,  Color.WHITE);
            AddRadioButton(2, new String[]{"Nothing", "Fire Only", "Scope Only", "Fire or Scope", "Fire & Scope"}, 0, new RadioGroup.OnCheckedChangeListener(){
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        UpdateConfiguration("AIM::TRIGGER", i);
                    }
                });
            AddSwitch(2,"Igonore Bot", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        UpdateConfiguration("HACK::IGBOT", isChecked ? 1 : 0);


                    }
                });
            AddSwitch(2,"Ignore Knocked", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        UpdateConfiguration("HACK::IGKNOCK", isChecked ? 1 : 0);

                    }
                });
            AddSwitch(2,"Visibility Check", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        UpdateConfiguration("HACK::VISICHECK", isChecked ? 1 : 0);

                    }
                });/*
            AddSwitch(2,"Sit Scope", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    RunCPP("/MEM 107");

                    }
                });
            AddSwitch(2,"Magic Bullet", false, new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			        UpdateConfiguration("MAGIC::BULLET", isChecked ? 1 : 0);

                    }
                });
            */
                
                
         }
    private void DrawCanvas() {

        
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
           // WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT, 0, getNavigationBarHeight(),
           // LAYOUT_FLAG,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
            | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE | WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN | WindowManager.LayoutParams.FLAG_FULLSCREEN,
            PixelFormat.RGBA_8888);

       /* if (Floating.hiderec_s ==1) {
         //   RecorderFakeUtils.setFakeRecorderWindowLayoutParams(params);
           // windowManager.addView(LinearLayout, params);
        }else{
           // windowManager.addView(LinearLayout, params);
		}*/
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
            params.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;

        params.gravity = Gravity.TOP | Gravity.START;        //Initially view will be added to top-left corner
        params.x = 0;
        params.y = 0;
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        
    }
    private int getNavigationBarHeight() {
        boolean hasMenuKey = ViewConfiguration.get(this).hasPermanentMenuKey();
        int resourceId = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0 && !hasMenuKey) {
            return getResources().getDimensionPixelSize(resourceId);
        }
        return 0;
    }
    
    
public void onDestroy() {
      //  this.windowManager.removeViewImmediate((View)this.espLayout);
        this.windowManager.removeViewImmediate((View)this.g_iconLayout);
        this.windowManager.removeViewImmediate((View)this.g_mainLayout);
        super.onDestroy();
    }

    private void  setValue(String key,boolean b) {
        SharedPreferences sp=this.getSharedPreferences("espValue",Context.MODE_PRIVATE);
        SharedPreferences.Editor ed= sp.edit();
        ed.putBoolean(key,b);
        ed.apply();

    }
    
    
    public void RunCPP(String path) {
        try {
            ExecuteElf("chmod 777 " + getFilesDir() + path);//VIRTUAL
            ExecuteElf(getFilesDir() + path);
            ExecuteElf("su -c chmod 777 " + getFilesDir() + path);//ROOT
            ExecuteElf("su -c " + getFilesDir() + path);
        } catch (Exception e) {
        }
    }

    private void ExecuteElf(String shell) {
        try {
            Runtime.getRuntime().exec(shell, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //////////////////////////////////////////////
    
    
    
    
    public void loadAssets() {
        String filepath =Environment.getExternalStorageDirectory() + "/Android/data/.tyb";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filepath);
            byte[] buffer = "DO NOT DELETE".getBytes();
            fos.write(buffer, 0, buffer.length);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        String pathf = getFilesDir().toString() + "/sock64";
        try {   
            OutputStream myOutput = new FileOutputStream(pathf);
            byte[] buffer = new byte[1024];
            int length;
            InputStream myInput = getAssets().open("sock64");
            while ((length = myInput.read(buffer)) > 0) {
                myOutput.write(buffer, 0, length);
            }
            myInput.close();
            myOutput.flush();
            myOutput.close();
        } catch (IOException e) { 
        }
        daemonPath = getFilesDir().toString() + "/sock64";
        try {
            Runtime.getRuntime().exec("chmod 777 " + daemonPath);
        } catch (IOException e) { 
        }
    }   
    
    
    
    
    public int onStartCommand(Intent intent, int n, int n2) {
        return 2;
    }
    public static interface OnListChoosedListener {
        public void onChoosed(int var1);
    }
	private native String keyexe(); 
	private native String keyexe22();
	private native String MODNAME();
	private native String SLOT();
    public native void SettingValue(int setting_code,boolean value);
    public native void Hack(int setting_code,boolean jboolean1);
    public native void Protection(int setting_code,boolean jboolean1);
    static native void Switch(int i, boolean k);
    public static native void Size(int num, float size);
    
    public String daemonPath;
    public static int hiderec_s = 0 ;
    public static int ab = 0;
    //private View LinearLayout;
    private native void onSendConfig(String s, String v);
    //private AssetManager assetManager;
  
    private void setImageFromAssets(ImageView image, String name) {
        AssetManager assetManager=getBaseContext().getAssets();
        try {
            InputStream inputStream=assetManager.open(name);
            image.setImageDrawable(Drawable.createFromStream(inputStream, null));
        } catch (IOException e) {
            Toast.makeText(this, " \n" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
	}
    
    public void onTaskRemoved(Intent intent) {
        stopSelf();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onTaskRemoved(intent);
   }
}

