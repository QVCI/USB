package com.example.listita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuletras extends AppCompatActivity implements View.OnClickListener {
    Button regresar;
    Button palindromo;
    Button vocales;
    Button consonantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuletras);
        regresar = findViewById(R.id.atras);
        palindromo = findViewById(R.id.palindromo);
        vocales = findViewById(R.id.vocales);
        consonantes = findViewById(R.id.consonantes);

        regresar.setOnClickListener(this);
        palindromo.setOnClickListener(this);
        vocales.setOnClickListener(this);
        consonantes.setOnClickListener(this);



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
        if (v.getId() == palindromo.getId())
        {
            Intent palindromo = new Intent(this, Palindromo.class);
            startActivity(palindromo);
            finish();
        }
        if (v.getId() == vocales.getId())
        {
            Intent vocales = new Intent(this, vocales.class);
            startActivity(vocales);
            finish();
        }
        if (v.getId() == consonantes.getId())
        {
            Intent consonantes = new Intent(this, consonantes.class);
            startActivity(consonantes);
            finish();
        }

    }
}