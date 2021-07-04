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
import com.example.responsi.kasus.ContentItem;
import com.example.responsi.kasus.Metadata;
import com.example.responsi.kasus.ResponseKasus;
import com.example.responsi.rs.DataItem;

import java.util.ArrayList;

public class AdapterKasus {

    private ArrayList<ContentItem> kasusDataItems  = new ArrayList<>();
    private Context context;

    public AdapterKasus(Context context) {this.context = context;}

    public void setKasusData(ArrayList<ContentItem> items){
        kasusDataItems.clear();
        kasusDataItems.addAll(items);
        notifyAll();
    }

    @NonNull
    @Override
    public AdapterKasus.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_kasus, viewGroup, false);
        return new AdapterKasus.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterKasus.ViewHolder holder, int position){
        holder.sembuh.setText(kasusDataItems.get(position).getConfirmationSelesai());
        holder.mati.setText(kasusDataItems.get(position).getConfirmationMeninggal());
        holder.kasus.setText(kasusDataItems.get(position).getConfirmationDiisolasi());
    }

    @Override
    public int getItemCount(){ return DataItem.size;  }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView sembuh, mati, kasus;
        CardView item;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            item = itemView.findViewById(R.id.cardView);
            sembuh = itemView.findViewById(R.id.sembuh);
            mati = itemView.findViewById(R.id.mati);
            kasus = itemView.findViewById(R.id.kasus);
        }
    }
}
