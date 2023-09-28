package com.example.myapplication;

public class Calculadora {
    private int num1;
    private int num2;
    private double resultado;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    double suma(){
        resultado = num1 + num2;
        return resultado;
    }
    double resta(){
        resultado = num1 - num2;
        return resultado;
    }
    double multi(){
        resultado = num1 * num2;
        return resultado;
    }
    double divi(){
        resultado = num1 / num2;
        return resultado;
    }
    double potencia(){

       resultado = Math.pow(num1,num2);
        return resultado;
    }
}
