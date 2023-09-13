package com.example.combocalculadora;

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
    public int suma(){
        int suma = numero1 + numero2;
        return suma;
    }
    public int resta(){
        int resta = numero1 - numero2;
        return resta;
    }
    public int multiplica(){
        int multiplica = numero1 * numero2;
        return multiplica;
    }
    public int divide(){
        int divide = numero1 / numero2;
        return divide;
    }
}