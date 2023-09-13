package com.example.actividad4;
public class Tarifas {
    private int duracion;

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int local(){
        int clocal = duracion * 1;
        return clocal;
    }
    public int nacional(){
        int cnacional = duracion * 2;
        return cnacional;
    }
    public int internacional(){
        int cinternacional = duracion * 3;
        return cinternacional;
    }
}
