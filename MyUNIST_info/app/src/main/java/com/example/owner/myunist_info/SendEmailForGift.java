package com.example.owner.myunist_info;

import android.app.Activity;
import android.app.Notification;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


public class SendEmailForGift extends Activity implements View.OnClickListener {

    EditText name;
    EditText phone_num;
    EditText schoolname;
    EditText contents;
    TextView send;

    JSONParser jsonParser = new JSONParser();

    String address = "http://52.68.202.214/unist_info/register.php";
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_MESSAGE = "message";


    // Progress Dialog
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email_for_gift);

        name = (EditText) findViewById(R.id.email_name);
        phone_num = (EditText) findViewById(R.id.email_phone);
        schoolname = (EditText) findViewById(R.id.email_school);
        contents = (EditText) findViewById(R.id.email_contents);
        send = (TextView) findViewById(R.id.email_send);
        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        new CreateUser().execute();

    }

    class CreateUser extends AsyncTask<String, String, String> {

        /**
         * Before starting background thread Show Progress Dialog
         */
        boolean failure = false;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(SendEmailForGift.this);
            pDialog.setMessage("Creating User...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... args) {
            // TODO Auto-generated method stub
            // Check for success tag
            int success;

            String username = name.getText().toString();
            String school = schoolname.getText().toString();
            String phone = phone_num.getText().toString();

            try {
                // Building Parameters
                List<NameValuePair> params = new ArrayList<NameValuePair>();
                params.add(new BasicNameValuePair("username", username));
                params.add(new BasicNameValuePair("school", school));
                params.add(new BasicNameValuePair("phone", phone));

                Log.d("request!", "starting");

                //Posting user data to script
                JSONObject json = jsonParser.makeHttpRequest(address, "POST", params);

                // full json response
                Log.d("Login attempt", json.toString());

                // json success element
                success = json.getInt(TAG_SUCCESS);
                if (success == 1) {
                    Log.d("User Created!", json.toString());
                    finish();
                    return json.getString(TAG_MESSAGE);
                } else {
                    Log.d("Login Failure!", json.getString(TAG_MESSAGE));
                    return json.getString(TAG_MESSAGE);

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;

        }

        /**
         * After completing background task Dismiss the progress dialog
         * *
         */
        protected void onPostExecute(String file_url) {
            // dismiss the dialog once product deleted
            pDialog.dismiss();
            if (file_url != null) {
                Toast.makeText(SendEmailForGift.this, file_url, Toast.LENGTH_LONG).show();
            }

        }

    }
}


        /*send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                username = name.getText().toString();
                phone_num = phone.getText().toString();
                schoolname = school.getText().toString();

                AsyncTask task = new AsyncTask() {
                    @Override
                    protected Object doInBackground(Object[] params) {
                        String address = "http://52.68.202.214/unist_info.register.php?username=" + username + "&phone=" + phone_num + "&school=" + schoolname;

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
                finish();
                /*
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);



            }
        });
    }*/
/*
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


*/
