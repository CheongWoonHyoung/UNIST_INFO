package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Step1Status extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1_status1);

        Intent intent = new Intent(this.getIntent());

        int engineering = intent.getIntExtra("engineering",1);
        int designer = intent.getIntExtra("designer",1);
        int management  = intent.getIntExtra("management", 1);

    }

}
