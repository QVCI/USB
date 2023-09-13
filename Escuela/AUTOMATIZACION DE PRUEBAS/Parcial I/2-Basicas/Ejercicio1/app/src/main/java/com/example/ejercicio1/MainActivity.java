package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ingresatexto;
    Button boton;
    TextView saludo;
    int numero = 0;
    String estado = "inicio";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresatexto = findViewById(R.id.ingresatexto);
        boton = findViewById(R.id.boton);
        saludo = findViewById(R.id.Saludo);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(estado.equals("inicio")){
            estado = "doble";
            boton.setText("doble");
            numero= Integer.parseInt(ingresatexto.getText().toString());
            saludo.setText("el doble es: " + (numero * 2));
        }else
            if(estado.equals("doble")){
                estado = "triple";
                boton.setText("triple");
                saludo.setText("el triple es: " + (numero * 3));
            }else
                if(estado.equals("triple")) {
                    estado = "inicio";
                    boton.setText("inicio");
                    saludo.setText("");
                }
    }
}