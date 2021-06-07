package com.juan.villanosretrofil;

public class Villanos {
    private String id;
    private String nombre;
    private String poderes;
    private String imagen;

    public Villanos(String id, String nombre, String poderes, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.poderes = poderes;
        this.imagen = imagen;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
