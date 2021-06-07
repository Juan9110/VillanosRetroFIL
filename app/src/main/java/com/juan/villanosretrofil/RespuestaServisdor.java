package com.juan.villanosretrofil;

import java.util.ArrayList;

public class RespuestaServisdor {
private ArrayList<Villanos>mensaje;
private int estado;

    public RespuestaServisdor(ArrayList<Villanos> mensaje, int estado) {
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public ArrayList<Villanos> getMensaje() {
        return mensaje;
    }

    public void setMensaje(ArrayList<Villanos> mensaje) {
        this.mensaje = mensaje;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}

