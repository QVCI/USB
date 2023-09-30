package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button botoncitor;
    Button botoncitos;
    String textoboton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        botoncitos.findViewById(R.id.botons);
        botoncitor.findViewById(R.id.botonregresa);
        botoncitos.setOnClickListener(this);
        botoncitor.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        textoboton = ((Button)view).getText().toString();
        if (textoboton.equals("otro saludo")){
            Saluditos saluditos = new Saluditos();
            Toast.makeText(this, saluditos.otrosaludo(), Toast.LENGTH_SHORT).show();

        }
        else
        if (textoboton.equals("regresar")){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}