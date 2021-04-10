package com.example.myney.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myney.R;

import java.util.ArrayList;

public class DataKeuanganAdapter extends RecyclerView.Adapter<DataKeuanganAdapter.DataKeuanganHolder> {
    ArrayList<DataKeuangan> dataKeuangans;
    public DataKeuanganAdapter(ArrayList<DataKeuangan> dataKeuangans) {
        this.dataKeuangans = dataKeuangans;
    }

    @NonNull
    @Override
    public DataKeuanganHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data_keuangan, parent, false);
        DataKeuanganHolder dataKeuanganHolder = new DataKeuanganHolder(view);
        return dataKeuanganHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataKeuanganHolder holder, int position) {
        DataKeuangan dataKeuangan = this.dataKeuangans.get(position);
        holder.kategori.setText(dataKeuangan.getKategori());
        holder.harga.setText(dataKeuangan.getHarga());
    }

    @Override
    public int getItemCount() {
        return dataKeuangans.size();
    }

    public class DataKeuanganHolder extends RecyclerView.ViewHolder{
        TextView kategori, harga;

        public DataKeuanganHolder(@NonNull View itemView) {
            super(itemView);
            kategori = itemView.findViewById(R.id.kategori);
            harga = itemView.findViewById(R.id.harga);
        }
    }
}
