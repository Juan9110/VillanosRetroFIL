package com.juan.villanosretrofil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class VillanosAdapter extends RecyclerView.Adapter<VillanosAdapter.VillanosHolder> {
    ArrayList<Villanos> listaVillanos;
    Context context;
    LayoutInflater inflater;

    public  VillanosAdapter(ArrayList<Villanos> listaVillanos,Context context){
        this.listaVillanos = listaVillanos;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @NotNull
    @Override
    public VillanosHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new VillanosHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull VillanosHolder holder, int position) {
        Villanos villanos = listaVillanos.get(position);
        holder.txtNombreVillano.setText(villanos.getNombre());
        String imagenUrl = "https://apcpruebas.es/imagenes/" + villanos.getImagen();

        Glide.with(context).load(imagenUrl).placeholder(R.drawable.tanos1).into(holder.imgVillano);
    }

    @Override
    public int getItemCount() {
        return listaVillanos.size();
    }

    class VillanosHolder extends RecyclerView.ViewHolder{
        ImageView imgVillano;
        TextView txtNombreVillano;

        public VillanosHolder(@NonNull View itenView) {
            super(itenView);
            imgVillano = itenView.findViewById(R.id.imgVillano);
            txtNombreVillano = itenView.findViewById(R.id.txtNombreVillanoItem);

        }
    }

}
