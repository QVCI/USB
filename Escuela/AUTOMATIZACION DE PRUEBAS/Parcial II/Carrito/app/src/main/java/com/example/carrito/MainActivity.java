package com.example.carrito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    Spinner combito2;
    ArrayAdapter adaptador;
    EditText numero;
    Button agregar;
    Button pagar;
    int cant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = findViewById(R.id.numero);
        agregar = findViewById(R.id.agregar);
        pagar = findViewById(R.id.pagar);
        agregar.setOnClickListener(this);
        combito2 = findViewById(R.id.combito);
        combito2.setOnItemSelectedListener(this);

        ArrayList <kekas> lista = new ArrayList<>();
        lista.add(new kekas(1, "selecciona", 0, 0, 0));
        lista.add(new kekas(2, "papas", 10, 0, 0 ));
        lista.add(new kekas(3, "queso", 15 ,0, 0));
        lista.add(new kekas(4, "picadillo",20, 0, 0));

        costos costos = new costos();
        costos.setCosto(lista.get(1).getCosto());

        adaptador = new ArrayAdapter<kekas>(this, android.R.layout.simple_selectable_list_item, lista);
        combito2.setAdapter(adaptador);
    }
    @Override
    public void onClick(View view) {

        ArrayList <kekas> lista = new ArrayList<>();
        costos costos = new costos();
        cant = (Integer.parseInt(numero.getText().toString()));



    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        kekas obj = new kekas();
        if (obj.getValor() > 0)
        {
            ArrayList <kekas> lista = new ArrayList<>();

            obj = (kekas) combito2.getSelectedItem();
            Toast.makeText(this, "clave " + obj.getValor() + "\n"
                    + "texto " + obj.getTexto(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }


}