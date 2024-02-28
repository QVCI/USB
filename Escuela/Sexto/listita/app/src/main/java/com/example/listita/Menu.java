package com.example.listita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    Button palindromo;
    Button calculadora;
    Button inflado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        palindromo = findViewById(R.id.palindromo);
        calculadora = findViewById(R.id.calculadora);
        inflado = findViewById(R.id.inflado);

        palindromo.setOnClickListener(this);
        calculadora.setOnClickListener(this);
        inflado.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == inflado.getId())
        {
            Intent inflado = new Intent(this, MainActivity.class);
            startActivity(inflado);
            finish();
        }
        if (v.getId() == calculadora.getId())
        {
            Intent Calculador = new Intent(this, Calculador.class);
            startActivity(Calculador);
            finish();
        }
        if (v.getId() == palindromo.getId())
        {
            Intent palindromo = new Intent(this, Palindromo.class);
            startActivity(palindromo);
            finish();
        }
    }
}