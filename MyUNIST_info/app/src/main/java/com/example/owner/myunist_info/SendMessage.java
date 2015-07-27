package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class SendMessage extends Activity {

    EditText edt_name;
    EditText edt_mail;
    EditText edt_title;
    EditText edt_content;
    Button btn_send;
    String name;
    String mail;
    String title;
    String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        edt_name = (EditText) findViewById(R.id.edt_name);
        edt_mail = (EditText) findViewById(R.id.edt_mail);
        edt_title = (EditText) findViewById(R.id.edt_title);
        edt_content = (EditText) findViewById(R.id.edt_content);
        btn_send = (Button) findViewById(R.id.btn_send);


        btn_send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                name = edt_name.getText().toString();
                mail = edt_mail.getText().toString();
                title = edt_title.getText().toString();
                content = edt_content.getText().toString();
                AsyncTask task = new AsyncTask() {
                    @Override
                    protected Object doInBackground(Object[] params) {
                        String address = "http://projectm001.sshel.com/check.php?name=" + name + "&mail=" + mail + "&title=" + title + "&content=" + content;

                        try {
                            URL url = new URL(address);
                            URLConnection conn = url.openConnection();
                            conn.connect();
                            InputStream iStream = conn.getInputStream();
                            BufferedReader br = new BufferedReader(new InputStreamReader(iStream));
                            final String data = br.readLine();
                            br.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return null;
                    }
                };
                task.execute();
                Toast.makeText(SendMessage.this, "Send Clear", Toast.LENGTH_SHORT).show();
                finish();
                /*
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
*/
            }
        });
    }

}
