package com.example.responsi;

import com.example.responsi.kasus.ContentItem;
import retrofit2.Call;
import retrofit2.http.GET;

public class RSRepository {
    @GET("rekapitulasi_v2/jabar/harian")
    public Call<ContentItem> getRSData() {
        return null;
    }
}
