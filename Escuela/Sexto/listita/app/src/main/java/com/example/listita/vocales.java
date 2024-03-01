package com.example.listita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class vocales extends AppCompatActivity implements View.OnClickListener {
    Button regresar;
    Button vocales;
    EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocales);
        regresar = findViewById(R.id.regresar);
        vocales = findViewById(R.id.vocales);
        input = findViewById(R.id.input);

        regresar.setOnClickListener(this);
        vocales.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == regresar.getId())
        {
            Intent menu = new Intent(this, menuletras.class);
            startActivity(menu);
            finish();
        }
        if (v.getId() == vocales.getId())
        {
            int contador = 0;
            System.out.println("valida");
            String texto = input.getText().toString().toLowerCase();
            System.out.println(texto);
            if (texto.isEmpty())
            {
                Toast.makeText(this, "Ingrese un texto", Toast.LENGTH_SHORT).show();
                System.out.println("vacio");
            }
            else
            {
                System.out.println(texto.length());
                for (int i = 0; i < texto.length(); ++i)
                {
                    String letra = String.valueOf(texto.charAt(i));
                    System.out.println(i);
                    if (letra.contains("a")||letra.contains("e")||letra.contains("i")||letra.contains("o")||letra.contains("u"))
                    {
                        ++contador;

                    }
                }
                Toast.makeText(this, "Hay: " + contador + " vocales", Toast.LENGTH_SHORT).show();
            }
        }

    }
}