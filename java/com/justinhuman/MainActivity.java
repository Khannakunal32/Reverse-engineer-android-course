package com.justinhuman;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.app.*;
import android.content.*;
import android.graphics.Color;
import android.net.*;
import android.os.*;
import android.provider.*;
import android.view.*;
import android.widget.*;
import java.io.*;
import java.io.IOException;
import java.util.Calendar;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.util.Log;
import android.view.View.OnClickListener;


import android.text.TextUtils;
import android.graphics.Typeface;
import android.app.AlertDialog.Builder;
import android.content.Intent;

public class MainActivity extends Activity {


	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
	
        Launcher.Init(this);
    }
}

