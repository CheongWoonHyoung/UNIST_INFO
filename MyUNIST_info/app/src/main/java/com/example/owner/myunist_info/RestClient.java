package com.example.owner.myunist_info;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by InJung on 2015. 9. 29..
 */
public class RestClient {
    private UNISTService service;
    private static RestClient client;

    public RestClient() {
        Gson gson = new GsonBuilder().create();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://10.0.1.4:5000")
                .setConverter(new GsonConverter(gson))
                .build();

        service = restAdapter.create(UNISTService.class);
    }

    public static synchronized UNISTService getService() {
        if (client == null)
            client = new RestClient();

        return client.service;
    }

    public interface UNISTService {
        @GET("/list")
        void getAnnounces(Callback<List<Announce>> callback);
    }
}
