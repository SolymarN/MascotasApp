package com.ivamadoka.mascotasapp.pojo;

import java.io.Serializable;

public class Mascota implements Serializable {
//implements Serializable   para q sea serailizable
    private String nombre;
    private int foto;
    private int raiting;

    public Mascota(String nombre, int foto, int raiting) {
        this.nombre = nombre;
        this.foto = foto;
        this.raiting = raiting;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}
