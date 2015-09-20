package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ezbrother on 15. 7. 20..
 */

public class Attendance extends Activity {

    Button check1;
    Button check2;
    Button check3;
    Button check4;
    Button check5;
    Button check6;
    Button check7;
    Button check8;
    Button check9;
    Button check10;
    Button check11;
    Button check12;
    FrameLayout uncheck1;
    FrameLayout uncheck2;
    FrameLayout uncheck3;
    FrameLayout uncheck4;
    FrameLayout uncheck5;
    FrameLayout uncheck6;
    FrameLayout uncheck7;
    FrameLayout uncheck8;
    FrameLayout uncheck9;
    FrameLayout uncheck10;
    FrameLayout uncheck11;
    FrameLayout uncheck12;

    TextView clear;

    int NumberOfCheck=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance);

        check1 = (Button) findViewById(R.id.check_ba);
        check2 = (Button) findViewById(R.id.check_chem);
        check3 = (Button) findViewById(R.id.check_cse);
        check4 = (Button) findViewById(R.id.check_ece);
        check5 = (Button) findViewById(R.id.check_ee);
        check6 = (Button) findViewById(R.id.check_mse);
        check7 = (Button) findViewById(R.id.check_mne);
        check8 = (Button) findViewById(R.id.check_mth);
        check9 = (Button) findViewById(R.id.check_phy);
        check10 = (Button) findViewById(R.id.check_uee);
        check11 = (Button) findViewById(R.id.check_dhe);
        check12 = (Button) findViewById(R.id.check_ls);

        uncheck1 = (FrameLayout) findViewById(R.id.unchecked_ba);
        uncheck1.bringToFront();
        uncheck2 = (FrameLayout) findViewById(R.id.unchecked_chem);
        uncheck2.bringToFront();
        uncheck3 = (FrameLayout) findViewById(R.id.unchecked_cse);
        uncheck3.bringToFront();
        uncheck4 = (FrameLayout) findViewById(R.id.unchecked_ece);
        uncheck4.bringToFront();
        uncheck5 = (FrameLayout) findViewById(R.id.unchecked_ee);
        uncheck5.bringToFront();
        uncheck6 = (FrameLayout) findViewById(R.id.unchecked_mse);
        uncheck6.bringToFront();
        uncheck7 = (FrameLayout) findViewById(R.id.unchecked_mne);
        uncheck7.bringToFront();
        uncheck8 = (FrameLayout) findViewById(R.id.unchecked_mth);
        uncheck8.bringToFront();
        uncheck9 = (FrameLayout) findViewById(R.id.unchecked_phy);
        uncheck9.bringToFront();
        uncheck10 = (FrameLayout) findViewById(R.id.unchecked_uee);
        uncheck10.bringToFront();
        uncheck11 = (FrameLayout) findViewById(R.id.unchecked_dhe);
        uncheck11.bringToFront();
        uncheck12 = (FrameLayout) findViewById(R.id.unchecked_ls);
        uncheck12.bringToFront();


        uncheck1.setVisibility(View.VISIBLE);
        uncheck2.setVisibility(View.VISIBLE);
        uncheck3.setVisibility(View.VISIBLE);
        uncheck4.setVisibility(View.VISIBLE);
        uncheck5.setVisibility(View.VISIBLE);
        uncheck6.setVisibility(View.VISIBLE);
        uncheck7.setVisibility(View.VISIBLE);
        uncheck8.setVisibility(View.VISIBLE);
        uncheck9.setVisibility(View.VISIBLE);
        uncheck10.setVisibility(View.VISIBLE);
        uncheck11.setVisibility(View.VISIBLE);
        uncheck12.setVisibility(View.VISIBLE);

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        String ch_check1= prefs.getString("ba", "");
        String ch_check2= prefs.getString("chem", "");
        String ch_check3= prefs.getString("cse", "");
        String ch_check4= prefs.getString("ece", "");
        String ch_check5= prefs.getString("ee", "");
        String ch_check6= prefs.getString("mse", "");
        String ch_check7= prefs.getString("mne", "");
        String ch_check8= prefs.getString("mth", "");
        String ch_check9= prefs.getString("phy", "");
        String ch_check10= prefs.getString("uee", "");
        String ch_check11= prefs.getString("dhe", "");
        String ch_check12= prefs.getString("ls", "");


        if(ch_check1.equals("1")) {
            uncheck1.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check2.equals("1")) {
            uncheck2.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check3.equals("1")) {
            uncheck3.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check4.equals("1")) {
            uncheck4.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check5.equals("1")) {
            uncheck5.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check6.equals("1")) {
            uncheck6.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check7.equals("1")) {
            uncheck7.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check8.equals("1")) {
            uncheck8.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check9.equals("1")) {
            uncheck9.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check10.equals("1")) {
            uncheck10.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check11.equals("1")) {
            uncheck11.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }
        if(ch_check12.equals("1")) {
            uncheck12.setVisibility(View.INVISIBLE);
            NumberOfCheck++;
        }




        clear =(TextView) findViewById(R.id.btn_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (NumberOfCheck <5) {
                    Toast.makeText(Attendance.this, "참여 횟수가 부족합니다", Toast.LENGTH_SHORT).show();
                } else if (NumberOfCheck >=5) {
                    //NumberOfCheck--;
                    Intent intent = new Intent(getApplicationContext(), SendEmailForGift.class);
                    startActivity(intent);

                }
            }

        });



    }
}
