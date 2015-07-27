package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Authentication extends Activity {
    EditText editText;
    Button button;
    private String ba = "3141";
    private String chem = "5926";
    private String cse = "5358";
    private String ece = "9793";
    private String ee = "2384";
    private String mse = "6264";
    private String mne = "3383";
    private String mth = "2795";
    private String phy = "0288";
    private String uee = "4197";
    private String dhe = "1693";
    private String ls = "9937";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authentication);

        editText = (EditText) findViewById(R.id.edt_check);
        button = (Button) findViewById(R.id.btn_check);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edit = editText.getText().toString();
                SharedPreferences prefs = getSharedPreferences("prefs",MODE_PRIVATE);
                SharedPreferences.Editor ed = prefs.edit();
                if (edit.equals(ba)) {
                    ed.putString("ba", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(chem)) {
                    ed.putString("chem", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(cse)) {
                    ed.putString("cse", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(ece)) {
                    ed.putString("ece", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(ee)) {
                    ed.putString("ee", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(mse)) {
                    ed.putString("mse", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(mne)) {
                    ed.putString("mne", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(mth)) {
                    ed.putString("mth", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(phy)) {
                    ed.putString("phy", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(uee)) {
                    ed.putString("uee", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(dhe)) {
                    ed.putString("dhe", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else if (editText.getText().toString().equals(ls)) {
                    ed.putString("ls", "1");
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Attendance.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Authentication.this, "잘못된 인증번호 입니다.", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}
