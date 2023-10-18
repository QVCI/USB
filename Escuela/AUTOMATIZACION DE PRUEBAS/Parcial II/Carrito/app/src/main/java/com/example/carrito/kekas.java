package com.example.carrito;

public class kekas
{
    public kekas(int valor, String texto, int costo, int subtotal, int total) {
        this.valor = valor;
        this.texto = texto;
        this.costo = costo;
        this.subtotal = subtotal;
        this.total = total;
    }

    public kekas(){

    }

    private int valor;
    private String texto;
    private int costo;
    private int subtotal;
    private int total;

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    /* el proposito de tu string es generar una
    representación de un objeto con una cadena
    de caracteres, en este caso es la variable texto*/


    public String toString()
    {
        return texto;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
