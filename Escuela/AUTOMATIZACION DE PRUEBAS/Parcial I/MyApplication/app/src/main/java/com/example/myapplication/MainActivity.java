package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listita;
    EditText num1;
    EditText num2;
    ArrayList<String> cadenitasA;
    Menu menu;
    ArrayAdapter adaptadito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu = new Menu();
        cadenitasA = new ArrayList<>();
        menu.agregar();
        cadenitasA = menu.regresa();

        listita = findViewById(R.id.lista);
        listita.setOnItemClickListener(this);

        adaptadito = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, cadenitasA);
        listita.setAdapter(adaptadito);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), cadenitasA.get(i), Toast.LENGTH_SHORT).show();
        if(cadenitasA.get(i)== 0)
    }
}