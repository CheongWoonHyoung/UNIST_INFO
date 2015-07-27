package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;


public class Splash1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);
        initialize();

    }

    private void initialize() {
        Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                Intent intent = new Intent(getApplicationContext(), Splash2.class);
                startActivity(intent);
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(0, 1500);


    }
}
