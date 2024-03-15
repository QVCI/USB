package com.example.tareadeinvestigacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button enviarcorreo;
    Button llamadatelefonica;
    Button paginaweb;
    Button entraragooglemaps;
    Button animaciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enviarcorreo = findViewById(R.id.enviarcorreo);
        llamadatelefonica = findViewById(R.id.llamadatelefonica);
        paginaweb = findViewById(R.id.paginaweb);
        entraragooglemaps = findViewById(R.id.entraragooglemaps);
        animaciones = findViewById(R.id.animaciones);

        enviarcorreo.setOnClickListener(this);
        llamadatelefonica.setOnClickListener(this);
        paginaweb.setOnClickListener(this);
        entraragooglemaps.setOnClickListener(this);
        animaciones.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == enviarcorreo.getId())
        {

        }
        if (v.getId() == llamadatelefonica.getId())
        {
            Intent llamar = new Intent(this, llamada.class);
            startActivity(llamar);
            finish();
        }
        if (v.getId() == paginaweb.getId())
        {
            Intent web = new Intent(this, com.example.tareadeinvestigacion.web.class);
            startActivity(web);
            finish();
        }
        if (v.getId() == entraragooglemaps.getId())
        {
            Intent web = new Intent(this, mapa.class);
            startActivity(web);
            finish();
        }
        if (v.getId() == animaciones.getId())
        {

        }


    }
}