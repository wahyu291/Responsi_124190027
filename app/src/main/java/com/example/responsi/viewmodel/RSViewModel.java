package com.example.responsi.viewmodel;

import androidx.lifecycle.MutableLiveData;

import com.example.responsi.rs.DataItem;
import com.example.responsi.APIMain;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RSViewModel {
    private APIMain apiMain;
    private MutableLiveData<ArrayList<DataItem>> listDataRS = new MutableLiveData<>();

    public void setRSData(){
        if (this.apiMain == null){
            apiMain = new APIMain();
        }

        apiMain.getApiRS().getRSData().enqueue(new Callback<com.example.responsi.rs.Response>() {
            @Override
            public void onResponse(Call<com.example.responsi.rs.Response> call, Response<com.example.responsi.rs.Response> response) {
                com.example.responsi.rs.Response response1 = response.body();
                if (response1 != null && response1.getData() != null){
                    ArrayList<DataItem> RSDataItems = response1.getData();
                    listDataRS.postValue(RSDataItems);
                }
            }

            @Override
            public void onFailure(Call<com.example.responsi.rs.Response> call, Throwable t) {

            }
        });
    }

    public MutableLiveData<ArrayList<DataItem>> getRSData() {return listDataRS;}

}
