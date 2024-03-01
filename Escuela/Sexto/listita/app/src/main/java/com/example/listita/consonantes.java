package com.example.listita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class consonantes extends AppCompatActivity implements View.OnClickListener {
    Button regresar;
    Button consonantes;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consonantes);
        regresar = findViewById(R.id.regresar);
        consonantes = findViewById(R.id.consonantes);
        input = findViewById(R.id.input);

        regresar.setOnClickListener(this);
        consonantes.setOnClickListener(this);
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
        if (v.getId() == consonantes.getId())
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
                    if (    letra.contains("b")||//aeiou
                            letra.contains("c")||
                            letra.contains("d")||
                            letra.contains("f")||
                            letra.contains("g")||
                            letra.contains("h")||
                            letra.contains("j")||
                            letra.contains("k")||
                            letra.contains("l")||
                            letra.contains("m")||
                            letra.contains("n")||
                            letra.contains("ñ")||
                            letra.contains("p")||
                            letra.contains("q")||
                            letra.contains("r")||
                            letra.contains("s")||
                            letra.contains("t")||
                            letra.contains("v")||
                            letra.contains("w")||
                            letra.contains("x")||
                            letra.contains("y")||
                            letra.contains("z")


                    )
                    {
                        ++contador;

                    }
                }
                Toast.makeText(this, "Hay: " + contador + " consonantes", Toast.LENGTH_SHORT).show();
            }
        }

    }
}