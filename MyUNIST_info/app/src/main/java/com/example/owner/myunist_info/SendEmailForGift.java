package com.example.owner.myunist_info;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SendEmailForGift extends Activity {

    EditText name;
    EditText phone;
    EditText school;
    EditText contents;
    TextView send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email_for_gift);

        name = (EditText)findViewById(R.id.email_name);
        phone = (EditText)findViewById(R.id.email_phone);
        school = (EditText)findViewById(R.id.email_school);
        contents = (EditText)findViewById(R.id.email_contents);
        send = (TextView)findViewById(R.id.email_send);




        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                String[] mailadd = {"unistinfo2015@gmail.com"};

                email.setType("plain/text");
                email.putExtra(Intent.EXTRA_EMAIL, mailadd);
                email.putExtra(Intent.EXTRA_SUBJECT, "[인증] "+name.getText().toString()+"("+phone.getText().toString()+")");
                email.putExtra(Intent.EXTRA_TEXT, "이름: " + name.getText().toString() + "\n" + "소속학교: " + school.getText().toString() + "\n" + "전화번호: " + phone.getText().toString() + "\n" +"행사 참여 소감: "+contents.getText().toString());

                startActivity(email);

            }
        });



    }


}
