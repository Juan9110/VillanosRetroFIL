package com.juan.villanosretrofil;

import java.util.ArrayList;

public class RespuestaServisdor {
private ArrayList<Villanos>mensaje;
private int estado;

    public RespuestaServisdor(ArrayList<Villanos> ListaVillanos, int estado) {
        this.mensaje = ListaVillanos;
        this.estado = estado;
    }

    public ArrayList<Villanos> getListaVillanos() {
        return mensaje;
    }

    public void setMensaje(ArrayList<Villanos> ListaVillanos) {
        this.mensaje = ListaVillanos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}

