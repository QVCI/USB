package com.example.listas;

import java.util.ArrayList;

public class Basurita
{
    private ArrayList <String> meses = new ArrayList<>();
    public ArrayList <String> regresa()
    {
        meses.add("enero");
        meses.add("febrero");
        meses.add("marzo");
        meses.add("abril");
        meses.add("mayo");
        meses.add("junio");
        meses.add("julio");
        meses.add("agosto");
        meses.add("septiembre");
        meses.add("octubre");
        meses.add("noviembre");
        meses.add("diciembre");
        return meses;
    }
}
