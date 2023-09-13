package com.example.ejercicio2;

public class Contador {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;

    }

    public int as (){
        int contador = texto.length();
        int as=0;
        for(int i = 0; i<contador; ++i)
            if(texto.charAt(i) == 'a' || texto.charAt(i) == 'A')
                ++as;
        return as;
    }


    public int es (){
        int contador = texto.length();
        int es=0;
        for(int i = 0; i<contador; ++i)
            if(texto.charAt(i) == 'e' || texto.charAt(i) == 'E')
                ++es;
        return es;
    }

    public int is (){
        int contador = texto.length();
        int is=0;
        for(int i = 0; i<contador; ++i)
            if(texto.charAt(i) == 'i' || texto.charAt(i) == 'I')
                ++is;
        return is;
    }
    public int os (){
        int contador = texto.length();
        int os=0;
        for(int i = 0; i<contador; ++i)
            if(texto.charAt(i) == 'o' || texto.charAt(i) == 'O')
                ++os;
        return os;
    }
    public int us (){
        int contador = texto.length();
        int us=0;
        for(int i = 0; i<contador; ++i)
            if(texto.charAt(i) == 'u' || texto.charAt(i) == 'U')
                ++us;
        return us;
    }
    public int consonantes(){
        int contador = texto.length();
        int nconsonantes = 0;
        int cconsonantes = 0;
        for(int i = 0; i<contador; ++i)
            if(texto.charAt(i) == 'A' || texto.charAt(i) == 'E' || texto.charAt(i) == 'I' ||
                    texto.charAt(i) == 'O' || texto.charAt(i) == 'U' || texto.charAt(i) == 'a' ||
                    texto.charAt(i) == 'e' || texto.charAt(i) == 'i' ||
                    texto.charAt(i) == 'o' || texto.charAt(i) == 'u' || texto.charAt(i) == '0' ||
                    texto.charAt(i) == '1' || texto.charAt(i) == '2' || texto.charAt(i) == '3' ||
                    texto.charAt(i) == '4' || texto.charAt(i) == '5' || texto.charAt(i) == '6' ||
                    texto.charAt(i) == '7' || texto.charAt(i) == '8' || texto.charAt(i) == '9'
            )
                ++nconsonantes;
        cconsonantes = texto.length() - nconsonantes;
        return cconsonantes;
    }
    public int numeros(){
        int contador = texto.length();
        int cnumeros = 0;
        for(int i = 0; i<contador; ++i)
            if (texto.charAt(i) == '0' || texto.charAt(i) == '1' || texto.charAt(i) == '2' || texto.charAt(i) == '3' ||
                    texto.charAt(i) == '4' || texto.charAt(i) == '5' || texto.charAt(i) == '6' ||
                    texto.charAt(i) == '7' || texto.charAt(i) == '8' || texto.charAt(i) == '9'
            )
                ++cnumeros;
        return cnumeros;
    }
    public boolean palindromo(){
        boolean cpalindromo = false;
        String sinespacios = texto.replaceAll(" ", "").toLowerCase();

        int cantidad = texto.length();

        for (int i = 0 ;i < (cantidad/2); i++)
            if(sinespacios.charAt(i) != sinespacios.charAt(cantidad - 1 - i))
                cpalindromo = false;
            else
                cpalindromo = true;
        return cpalindromo;
    }
}