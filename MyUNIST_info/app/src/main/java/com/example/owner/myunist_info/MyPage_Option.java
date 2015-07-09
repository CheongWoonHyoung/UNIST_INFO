package com.example.owner.myunist_info;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MyPage_Option extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //TextView opt_Name = (TextView) findViewById(R.id.option);
        Intent intent = getIntent();
        int opt_num  = intent.getIntExtra("OPT",0);
        switch(opt_num){
            case 1:
                setContentView(R.layout.mypage__option);
                break;
            case 2:
                setContentView(R.layout.mypage__option);
                break;
            case 3:
                setContentView(R.layout.attendance);
                break;
            case 4:
                setContentView(R.layout.mypage__option);
                break;
            case 5:
                setContentView(R.layout.mypage__option);
                break;
            case 6:
                setContentView(R.layout.mypage__option);
                break;

            default:
                break;
        }
    }

}
