package com.example.owner.myunist_info;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class AnnounceActivity extends AppCompatActivity {
    AnnounceAdapter adapter = new AnnounceAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announce);

        final ListView announceLV = (ListView) findViewById(R.id.list_announce);
        announceLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Announce announce = (Announce) adapter.getItem(position);


                AnnounceViewDialog dialog = AnnounceViewDialog.newInstance(announce);
                dialog.show(getSupportFragmentManager(), "ANNOUNCE_DIALOG");
            }
        });

        RestClient.UNISTService service = RestClient.getService();
        service.getAnnounces(new Callback<List<Announce>>() {
            @Override
            public void success(List<Announce> announces, Response response) {
                adapter.setItems(announces);
                announceLV.setAdapter(adapter);
            }

            @Override
            public void failure(RetrofitError error) {
                error.printStackTrace();
            }
        });
    }
}
