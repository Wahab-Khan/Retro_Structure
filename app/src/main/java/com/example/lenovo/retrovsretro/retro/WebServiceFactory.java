package com.example.lenovo.retrovsretro.retro;

import android.content.Context;

import com.example.lenovo.retrovsretro.contract.Contract;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebServiceFactory {

    Context context;

    public static WebClient webResponce(){

        WebClient client = null;
        if(client == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Contract.baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            client = retrofit.create(WebClient.class);
        }

        return client;
    }
}
