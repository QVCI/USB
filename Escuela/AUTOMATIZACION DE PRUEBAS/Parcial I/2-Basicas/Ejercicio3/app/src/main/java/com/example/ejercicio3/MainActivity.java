package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Texto;
    EditText campo1;
    EditText campo2;
    Button TRIANGULO;
    Button CUADRADO;
    Button RECTANGULO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Texto = findViewById(R.id.Texto);
        campo1 = findViewById(R.id.campo1);
        campo2 = findViewById(R.id.campo2);
        TRIANGULO = findViewById(R.id.TRIANGULO);
        CUADRADO = findViewById(R.id.CUADRADO);
        RECTANGULO = findViewById(R.id.RECTANGULO);
        TRIANGULO.setOnClickListener(this);
        CUADRADO.setOnClickListener(this);
        RECTANGULO.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String textoboton = ((Button)v).getText().toString();
        Calculadora calculadora = new Calculadora();

        if(textoboton.equals("TRIANGULO")){
            TRIANGULO.setText("AREA TRIANGULO");
            campo1.setEnabled(true);
            campo2.setEnabled(true);
            CUADRADO.setEnabled(false);
            RECTANGULO.setEnabled(false);
            if (textoboton.equals("AREA TRIANGULO")){
                calculadora.setNum1(Integer.parseInt(campo1.getText().toString()));
                calculadora.setNum2(Integer.parseInt(campo2.getText().toString()));
                campo1.setEnabled(false);
                campo2.setEnabled(false);
                TRIANGULO.setText("TRIANGULO");
                CUADRADO.setEnabled(true);
                RECTANGULO.setEnabled(true);
                Texto.setText("area del triangulo: " + calculadora.Triangulo());

            }
        }
        else
            if(textoboton.equals("CUADRADO")){

            }
            else
                if(textoboton.equals("RECTANGULO")){

                }




        }
    }