package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    Spinner sdeptos, sprods;
    Button botoncito;
    ArrayAdapter<String> aadeptos;
    ArrayAdapter<Basurita> aaprods;
    ArrayList<Basurita> Arecibe = new ArrayList<>();
    int seleccionado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botoncito = findViewById(R.id.boton);
        botoncito.setOnClickListener(this);

        sdeptos = findViewById(R.id.combito);
        sdeptos.setOnItemSelectedListener(this);

        sprods = findViewById(R.id.combito2);
        sprods.setOnItemSelectedListener(this);

        String deptos[] = {"selecciona", "papeleria", "computacion"};

        aadeptos =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,deptos);
        sdeptos.setAdapter(aadeptos);
    }

    @Override
    public void onClick(View view)
    {
        Toast.makeText(this, sdeptos.getSelectedItem().toString() + " " + sprods.getSelectedItem(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        if (adapterView.getId() == R.id.combito)
        {
            seleccionado = sdeptos.getSelectedItemPosition();
            Alistito aregreso = new Alistito();
            if (seleccionado == 1)
            {
                aregreso.agregar(1);
                Arecibe = aregreso.regresar();
                aaprods = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Arecibe);
                sprods.setAdapter(aaprods);
            }
            else
            {
                if (seleccionado == 2)
                {
                    aregreso.agregar(2);
                    Arecibe = aregreso.regresar();
                    aaprods = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Arecibe);
                    sprods.setAdapter(aaprods);
                }
                else
                {
                    if (seleccionado == 0)
                    {
                        sprods.setAdapter(null);
                    }
                }
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }
}