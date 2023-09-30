package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button saludo;
    Button otroboton;
    String textoboton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saludo.findViewById(R.id.boton);
        otroboton.findViewById(R.id.otroboton);
        saludo.setOnClickListener(this);
        otroboton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        textoboton = ((Button)view).getText().toString();
        if (textoboton.equals("saludo")){
            Saluditos saluditos = new Saluditos();
            Toast.makeText(this, saluditos.saludo(), Toast.LENGTH_SHORT).show();

        }
        else
            if (textoboton.equals("otra actividad")){
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
            }
    }
}