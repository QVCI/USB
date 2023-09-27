package com.example.sumalistas;

import java.util.ArrayList;

public class Dias {
    ArrayList<String> cadenitas;

    Dias(){
        cadenitas = new ArrayList<>();
    }
    public void agregar(){
        cadenitas.add("lunes");
        cadenitas.add("martes");
        cadenitas.add("miercoles");
        cadenitas.add("jueves");
        cadenitas.add("viernes");
        cadenitas.add("sabado");
        cadenitas.add("domingo");
    }
    public ArrayList regreso(){
        return cadenitas;
    }
}
