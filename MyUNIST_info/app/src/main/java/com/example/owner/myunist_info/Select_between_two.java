package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;


public class Select_between_two extends Activity {
Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unicorn_vs);
        mcontext = this;

        LinearLayout btn1 = (LinearLayout) findViewById(R.id.btn_1);
        LinearLayout btn2 = (LinearLayout) findViewById(R.id.btn_2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mcontext,Authentication.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mcontext,Multiple_choice_Intro.class);
                startActivity(i);

            }
        });


    }

}
