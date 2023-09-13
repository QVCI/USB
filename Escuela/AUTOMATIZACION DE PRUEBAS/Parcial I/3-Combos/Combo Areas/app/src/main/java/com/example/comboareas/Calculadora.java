package com.example.comboareas;
public class Calculadora {
    private int numero1;
    private int numero2;

    public int getNumero1() {
        return numero1;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public int triangulo(){
        int atriangulo = (numero1 * numero2)/2;
        return atriangulo;
    }
    public int rectangulo(){
        int arectangulo = numero1 * numero2;
        return arectangulo;
    }
    public int cuadrado(){
        int acuadrado = numero1 * numero1;
        return acuadrado;
    }
}
