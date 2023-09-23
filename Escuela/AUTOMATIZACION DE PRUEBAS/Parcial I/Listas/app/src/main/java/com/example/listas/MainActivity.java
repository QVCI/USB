package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button botoncitol, botonciton, botoncitoi, bpaguito;
    EditText editadito;
    arraycito alistito;
    int totalg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alistito = new arraycito();
        
        editadito = findViewById(R.id.textito);
        
        botoncitol = findViewById(R.id.blocal);
        botoncitol.setOnClickListener(this);
        
        botonciton = findViewById(R.id.bnacional);
        botonciton.setOnClickListener(this);
        
        botoncitoi = findViewById(R.id.binternacional);
        botoncitoi.setOnClickListener(this);
        
        bpaguito = findViewById(R.id.bpagar);
        bpaguito.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String cadenita = ((Button)view).getText().toString();
        if (cadenita.equals("local")){
            Clasesita objetito = new Clasesita();
            objetito.setTipo(1);
            objetito.setDuracion(Integer.parseInt(editadito.getText().toString()));
            objetito.costol();
            alistito.agregar(objetito);
            Toast.makeText(this, "agregado", Toast.LENGTH_SHORT).show();
        }
        else
            if (cadenita.equals("nacional")){
                Clasesita objetito = new Clasesita();
                objetito.setTipo(2);
                objetito.setDuracion(Integer.parseInt(editadito.getText().toString()));
                objetito.coston();
                alistito.agregar(objetito);
                Toast.makeText(this, "agregado", Toast.LENGTH_SHORT).show();
            }
            else
                if (cadenita.equals("internacional")){
                    Clasesita objetito = new Clasesita();
                    objetito.setTipo(3);
                    objetito.setDuracion(Integer.parseInt(editadito.getText().toString()));
                    objetito.costoi();
                    alistito.agregar(objetito);
                    Toast.makeText(this, "agregado", Toast.LENGTH_SHORT).show();
                }
                if (cadenita.equals("pagar")){
                    ArrayList<Clasesita> Aregresito = new ArrayList<>();
                    Aregresito = alistito.regresar();
                    for (int i = 0; i < Aregresito.size(); ++i){
                        Toast.makeText(this, Aregresito.get(i).getTipo() + " "
                                + Aregresito.get(i).getDuracion() + " "
                                + Aregresito.get(i).getCosto() + " ", Toast.LENGTH_SHORT).show();
                    }
                }

    }
}