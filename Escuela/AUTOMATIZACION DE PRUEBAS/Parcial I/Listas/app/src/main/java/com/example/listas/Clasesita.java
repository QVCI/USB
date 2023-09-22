package com.example.listas;

public class Clasesita {
    private int tipo;
    private int duracion;
    private int costo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void costol(){
        costo = 1 * duracion;
    }
    public void coston(){
        costo = 2 * duracion;
    }
    public void costoi(){
        costo = 3 * duracion;
    }
}
