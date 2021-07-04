package com.example.responsi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.cardview.widget.CardView;

import com.example.responsi.R;
import com.example.responsi.rs.DataItem;
import com.example.responsi.kasus.Metadata;
import com.example.responsi.rs.Response;

import java.util.ArrayList;

public class AdapterRS extends RecyclerView.Adapter<AdapterRS.ViewHolder> {
    private ArrayList<DataItem> dataItems = new ArrayList<>();
    private Context context;
    private ArrayList<Metadata> Metadata;

    public AdapterRS( Context context) {
        this.context = context;
    }

    public Context getContext(){
        return context;
    }

    public void setData(ArrayList<DataItem> items){
        dataItems.clear();
        dataItems.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdapterRS.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_rs, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i){
        holder}

    @Override
    public int getItemCount(){ return DataItem.size;  }

    public class ViewHolder extends RecyclerView.ViewHolder{
        Button buttonMap;
        TextView nama, alamat;
        CardView item;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            item = itemView.findViewById(R.id.cardView);
            nama = itemView.findViewById(R.id.nama_rs);
            alamat = itemView.findViewById(R.id.alamat_rs);
            buttonMap = itemView.findViewById(R.id.buttonMap);
        }
    }
}
