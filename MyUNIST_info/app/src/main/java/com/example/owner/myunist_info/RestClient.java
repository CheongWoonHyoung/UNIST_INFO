package com.example.owner.myunist_info;

import java.util.List;

import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by InJung on 2015. 9. 29..
 */
public class RestClient {
    private UNISTService service;
    private static RestClient client;

    public RestClient() {
        Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .build();

        service = restAdapter.create(UNISTService.class);
    }

    public synchronized UNISTService getService() {
        if (client == null)
            client = new RestClient();

        return client.service;
    }

    public interface UNISTService {
        @GET("/list")
        List<Announce> getAnnounces();
    }
}
