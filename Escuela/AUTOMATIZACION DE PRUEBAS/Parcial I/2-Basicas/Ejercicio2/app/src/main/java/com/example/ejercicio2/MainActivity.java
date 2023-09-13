package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText textos;
    Button vocales;
    Button consonantes;
    Button numeros;
    Button palindromo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textos = findViewById(R.id.texto);
        vocales = findViewById(R.id.vocales);
        vocales.setOnClickListener(this);
        consonantes = findViewById(R.id.consonantes);
        consonantes.setOnClickListener(this);
        numeros = findViewById(R.id.numeros);
        numeros.setOnClickListener(this);
        palindromo = findViewById(R.id.palindromo);
        palindromo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String texto = ((Button)v).getText().toString();
        Contador contador = new Contador();
        contador.setTexto(textos.getText().toString());

        if(texto.equals("vocales")) {
            Toast.makeText(this, "Vocales: " + "\nA's: "  +
                    contador.as() + "\nE'S: " + contador.es() + "\nI'S: " +
                    contador.is() + "\nO'S: " + contador.os() + "\nU'S: " +
                    contador.us(), Toast.LENGTH_SHORT).show();
        }
        if(texto.equals("consonantes")){
            Toast.makeText(this,"Total de consonantes: " + contador.consonantes(),Toast.LENGTH_LONG).show();
        }
        if(texto.equals("numeros")){
            Toast.makeText(this,"Total de numeros: " + contador.numeros(),Toast.LENGTH_LONG).show();
        }
        if(texto.equals("palindromo")) {
            if (contador.palindromo() == true)
                Toast.makeText(this, "Si es palindromo", Toast.LENGTH_LONG).show();
            else {
                Toast.makeText(this, "No es palindromo", Toast.LENGTH_LONG).show();
            }
        }
    }
}