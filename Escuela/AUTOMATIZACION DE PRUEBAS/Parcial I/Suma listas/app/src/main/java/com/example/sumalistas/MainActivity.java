package com.example.sumalistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listita;
    ArrayList <String> cadenitasA;
    Dias objetito;
    ArrayAdapter adaptadito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objetito = new Dias();
        cadenitasA = new ArrayList<>();
        objetito.agregar();
        cadenitasA = objetito.regreso();

        listita = findViewById(R.id.lista);
        listita.setOnItemClickListener(this);

        adaptadito = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, cadenitasA);
        listita.setAdapter(adaptadito);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        nu  m1;

    }
}