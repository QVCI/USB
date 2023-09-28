package com.example.myapplication;

import java.util.ArrayList;

public class Menu {
    ArrayList<String> opciones;


    Menu(){
        opciones = new ArrayList<>();
    }
    public void agregar(){
        opciones.add("suma");
        opciones.add("resta");
        opciones.add("multiplicación");
        opciones.add("división");
        opciones.add("potencia");
    }
    public ArrayList regresa(){
        return opciones;
    }
}
