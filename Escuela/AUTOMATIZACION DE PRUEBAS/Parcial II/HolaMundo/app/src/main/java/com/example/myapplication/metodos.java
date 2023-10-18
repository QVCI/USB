package com.example.myapplication;

public class metodos
{
    String unidades[]={"un","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
    String dices [] = {"", "once","doce", "trece", "catorce", "quince", "dieciseis", "decisiete", "dieciocho", "diecinueve"};
    String decenas [] = {"veint", "treina", "cuarenta", "cincuenta", "sesenta", "setenta"};
    public String cerocifras()
    {
        return "";
    }
    public String unacifra(int nume)
    {
        String cadenita="";
        cadenita = unidades[nume];
        return cadenita;
    }
    public String doscifras(String textote)
    {
        String cadenita = "";
        String solito = textote.substring(1,2);
        int numero = Integer.parseInt(solito);
        if (textote.substring(0,1).equals("1"))
        {
            cadenita = dices [numero];
        }
        return cadenita;
    }
}
