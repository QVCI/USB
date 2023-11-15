package com.example.myapplication;

public class Calculador
{
    private int cantidad;
    private int costo;
    private int total;

    public int getTotal() {
        total = costo * cantidad;
        return total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }


}
