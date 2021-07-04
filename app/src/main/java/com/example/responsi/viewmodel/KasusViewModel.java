package com.example.responsi.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.responsi.kasus.ContentItem;
import com.example.responsi.kasus.ResponseKasus;
import com.example.responsi.kasus.Data;
import com.example.responsi.APIMain;
import com.example.responsi.rs.DataItem;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class KasusViewModel {

    private APIMain apiMain;
    private MutableLiveData<ArrayList<DataItem>> listDataKasus = new MutableLiveData<>();

    public void setKasusData(){
        if (this.apiMain == null){
            apiMain = new APIMain();
        }

        apiMain.getApiRS().getKasusData().enqueue(new Callback<ResponseKasus>() {
            @Override
            public void onResponse(Call<ResponseKasus> call, Response<ResponseKasus> response) {
                ResponseKasus response1 = response.body();
                if (response1 != null && response1.getData() != null){
                    Data KasusDataItems = response1.getData();
                    listDataKasus.postValue(KasusDataItems);
                }
            }

            @Override
            public void onFailure(Call<ResponseKasus> call, Throwable t) {

            }
        });
    }

    public MutableLiveData<ArrayList<DataItem>> getRSData() {return listDataKasus;}

}
