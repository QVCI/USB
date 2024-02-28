package com.example.listita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Palindromo extends AppCompatActivity implements View.OnClickListener {
    Button regresar;
    TextView valida;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindromo);

        regresar = findViewById(R.id.regresar);
        valida = findViewById(R.id.valida);
        input = findViewById(R.id.input);

        regresar.setOnClickListener(this);
        valida.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == regresar.getId())
        {
            Intent menu = new Intent(this, com.example.listita.Menu.class);
            startActivity(menu);
            finish();
        }
        if (v.getId() == valida.getId())
        {
            System.out.println("valida");
            String texto = input.getText().toString().toLowerCase();
            if (texto.isEmpty())
            {
                Toast.makeText(this, "Ingrese un texto", Toast.LENGTH_SHORT).show();
            }
            else
            {


                System.out.println(texto);

                StringBuilder textoinvertido = new StringBuilder(texto);
                textoinvertido.reverse();
                System.out.println(textoinvertido);
                if (textoinvertido.toString().equals(texto))
                {
                    System.out.println("es");
                    valida.setBackgroundResource(R.drawable.verde);
                    valida.setTextColor(Color.BLACK);
                }
                else
                {
                    System.out.println("noes");
                    valida.setBackgroundResource(R.drawable.rojo);
                    valida.setTextColor(Color.WHITE);
                }

            }
        }

    }
}