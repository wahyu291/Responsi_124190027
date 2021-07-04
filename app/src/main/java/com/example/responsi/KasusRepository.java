package com.example.responsi;

import com.example.responsi.kasus.ContentItem;
import retrofit2.Call;
import retrofit2.http.GET;

public class KasusRepository {
    @GET("rekapitulasi_v2/jabar/harian")
    Call<ContentItem> getKasusData() {
        return null;
    }
}
