package com.example.responsi.rs;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("status_code")
	private int statusCode;

	@SerializedName("data")
	private List<DataItem> data;

	public void setStatusCode(int statusCode){
		this.statusCode = statusCode;
	}

	public int getStatusCode(){
		return statusCode;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"status_code = '" + statusCode + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}