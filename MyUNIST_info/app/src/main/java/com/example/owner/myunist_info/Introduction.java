package com.example.owner.myunist_info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Introduction extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

        TextView dept_Name = (TextView) findViewById(R.id.dept);
        Intent intent = getIntent();
        int dept_num  = intent.getIntExtra("DEPT",0);
        switch(dept_num){
            case 1:
                dept_Name.setText("EE");
                break;
            case 2:
                dept_Name.setText("CSE");
                break;
            case 3:
                dept_Name.setText("ECE");
                break;
            case 4:
                dept_Name.setText("PHYSICS");
                break;
            case 5:
                dept_Name.setText("MATH");
                break;
            case 6:
                dept_Name.setText("MECHANIC");
                break;
            case 7:
                dept_Name.setText("URBAN");
                break;
            case 8:
                dept_Name.setText("BUSINESS");
                break;
            case 9:
                dept_Name.setText("LIFE");
                break;
            case 10:
                dept_Name.setText("MATERIAL");
                break;
            case 11:
                dept_Name.setText("DESIGN");
                break;
            case 12:
                dept_Name.setText("CEMISTRY");
                break;
            default:
                break;
        }



    }

}
