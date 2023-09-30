package com.example.consonantitas;

public class Clasesita {
    private  String cadenitas;

    public String getCadenitas() {
        return cadenitas;
    }

    public void setCadenitas(String cadenitas) {
        this.cadenitas = cadenitas;
    }
    public int cuantas() {
        int contadas = 0;
        String consontantes
     = "bcdfghjklmnñpqrstvwxyz";
        int cuantas = cadenitas.length();
        for (int i = 0; i<cuantas; ++i){
            if (consontantes.contains(String.valueOf(cadenitas.charAt(i)))){
                ++contadas;
            }
        }
        return contadas;
    }
    public int numeros(){
        int numeros = 0;
        String num ="0123456789";
        int tamaño = cadenitas.length();
        for(int i=0; i<tamaño; ++i){
            if (num.contains(String.valueOf(cadenitas.charAt(i)))){
                ++numeros;
            }
        }
        return numeros;
    }
    public int vocales(){
        int cvocales = 0;
        int total=cadenitas.length();
        cvocales = total -cuantas() - numeros();
        return  cvocales;
    }

}



