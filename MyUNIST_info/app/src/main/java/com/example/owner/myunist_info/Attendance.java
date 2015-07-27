package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    Button uncheck1;
    Button uncheck2;
    Button uncheck3;
    Button uncheck4;
    Button uncheck5;
    Button uncheck6;
    Button uncheck7;
    Button uncheck8;
    Button uncheck9;
    Button uncheck10;
    Button uncheck11;
    Button uncheck12;

    Button clear;

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

        uncheck1 = (Button) findViewById(R.id.unchecked_ba);
        uncheck1.bringToFront();
        uncheck2 = (Button) findViewById(R.id.unchecked_chem);
        uncheck2.bringToFront();
        uncheck3 = (Button) findViewById(R.id.unchecked_cse);
        uncheck3.bringToFront();
        uncheck4 = (Button) findViewById(R.id.unchecked_ece);
        uncheck4.bringToFront();
        uncheck5 = (Button) findViewById(R.id.unchecked_ee);
        uncheck5.bringToFront();
        uncheck6 = (Button) findViewById(R.id.unchecked_mse);
        uncheck6.bringToFront();
        uncheck7 = (Button) findViewById(R.id.unchecked_mne);
        uncheck7.bringToFront();
        uncheck8 = (Button) findViewById(R.id.unchecked_mth);
        uncheck8.bringToFront();
        uncheck9 = (Button) findViewById(R.id.unchecked_phy);
        uncheck9.bringToFront();
        uncheck10 = (Button) findViewById(R.id.unchecked_uee);
        uncheck10.bringToFront();
        uncheck11 = (Button) findViewById(R.id.unchecked_dhe);
        uncheck11.bringToFront();
        uncheck12 = (Button) findViewById(R.id.unchecked_ls);
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
            uncheck5.setVisibility(View.INVISIBLE);
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




        clear =(Button) findViewById(R.id.btn_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (NumberOfCheck >= 5) {

                } else {
                    Toast.makeText(Attendance.this, "다섯개 이상의 부스 참여를 인증한 뒤 다시 시도해 주십시오.", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
