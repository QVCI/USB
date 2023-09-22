package com.example.listas;

import java.util.ArrayList;

public class arraycito {
    ArrayList<Clasesita> alistito = new ArrayList();

    public void agregar(Clasesita objetito){
        alistito.add(objetito);

    }
    public ArrayList regresar(){
        return alistito;
    }
}
