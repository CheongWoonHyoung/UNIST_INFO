package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;


public class Step1Status extends Activity {
    private ProgressBar engine;
    private ProgressBar design;
    private ProgressBar manage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step1status);

        Intent intent = new Intent(this.getIntent());

        int engineering = intent.getIntExtra("engineering",1);
        int designer = intent.getIntExtra("designer",1);
        int management  = intent.getIntExtra("management", 1);
        engine = (ProgressBar) findViewById(R.id.engine);
        manage = (ProgressBar) findViewById(R.id.manage);
        design = (ProgressBar) findViewById(R.id.design);
        engine.setProgress(engineering);
        design.setProgress(designer);
        manage.setProgress(management);

    }

}
