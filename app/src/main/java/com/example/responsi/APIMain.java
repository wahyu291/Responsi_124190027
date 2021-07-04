package com.example.responsi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIMain {
    private Retrofit retrofit;

    public RSRepository getApiRS(){
        String BASE_URL = "https://covid19-public.digitalservice.id/api/v1/";
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(RSRepository.class);
    }

    public KasusRepository getApiKasus(){
        String BASE_URL = "https://covid19-public.digitalservice.id/api/v1/";
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(KasusRepository.class);
    }
}
