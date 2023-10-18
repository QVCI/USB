package com.example.myapplication;

public class Metodos
{
    String unidades[]={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
    String dices [] = {"diez", "once","doce", "trece", "catorce", "quince", "dieciseis", "decisiete", "dieciocho", "diecinueve"};
    String veintes [] = {"veinte","veintiuno","veintidos","veintitres","veinticuatro","veinticinco","veintiseis","veintisiete","veintiocho","veintinueve",};
    String treintas[] = {
            "treinta", "treinta y uno", "treinta y dos", "treinta y tres", "treinta y cuatro",
            "treinta y cinco", "treinta y seis", "treinta y siete", "treinta y ocho", "treinta y nueve"
    };

    String cuarentas[] = {
            "cuarenta", "cuarenta y uno", "cuarenta y dos", "cuarenta y tres", "cuarenta y cuatro",
            "cuarenta y cinco", "cuarenta y seis", "cuarenta y siete", "cuarenta y ocho", "cuarenta y nueve"
    };

    String cincuentas[] = {
            "cincuenta", "cincuenta y uno", "cincuenta y dos", "cincuenta y tres", "cincuenta y cuatro",
            "cincuenta y cinco", "cincuenta y seis", "cincuenta y siete", "cincuenta y ocho", "cincuenta y nueve"
    };

    String sesentas[] = {
            "sesenta", "sesenta y uno", "sesenta y dos", "sesenta y tres", "sesenta y cuatro",
            "sesenta y cinco", "sesenta y seis", "sesenta y siete", "sesenta y ocho", "sesenta y nueve"
    };

    String setentas[] = {
            "setenta", "setenta y uno", "setenta y dos", "setenta y tres", "setenta y cuatro",
            "setenta y cinco", "setenta y seis", "setenta y siete", "setenta y ocho", "setenta y nueve"
    };

    String ochentas[] = {
            "ochenta", "ochenta y uno", "ochenta y dos", "ochenta y tres", "ochenta y cuatro",
            "ochenta y cinco", "ochenta y seis", "ochenta y siete", "ochenta y ocho", "ochenta y nueve"
    };

    String noventas[] = {
            "noventa", "noventa y uno", "noventa y dos", "noventa y tres", "noventa y cuatro",
            "noventa y cinco", "noventa y seis", "noventa y siete", "noventa y ocho", "noventa y nueve"
    };

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
        else if (textote.substring(0,1).equals("2"))
            {
                cadenita = veintes[numero];
            }
            else if (textote.substring(0,1).equals("3"))
                {
                    cadenita = treintas[numero];
                }
                else if (textote.substring(0,1).equals("4"))
                {
                    cadenita = cuarentas[numero];
                }
                    else if (textote.substring(0,1).equals("5"))
                    {
                        cadenita = cincuentas[numero];
                    }
                        else if (textote.substring(0,1).equals("6"))
                        {
                            cadenita = sesentas[numero];
                        }
                            else if (textote.substring(0,1).equals("7"))
                            {
                                cadenita = setentas[numero];
                            }
                                else if (textote.substring(0,1).equals("8"))
                                {
                                    cadenita = ochentas[numero];
                                }
                                    else if (textote.substring(0,1).equals("9"))
                                    {
                                        cadenita = noventas[numero];
                                    }

        return cadenita;
    }

}
