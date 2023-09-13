package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner combito;
    ImageView imagenv;
    String imagenes [] = {"selecciona","kike", "minovia"};
    ArrayAdapter adaptadito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adaptadito = new ArrayAdapter<String>(this,
                android.R.layout.simple_selectable_list_item,
                imagenes);
        imagenv = findViewById(R.id.imagen);
        combito = findViewById(R.id.combo);
        combito.setOnItemSelectedListener(this);
        combito.setAdapter(adaptadito);
    }
    //se descargan imagenes y se pegan en "drawble", debe ser .jpg

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String cadenita =  adapterView.getItemAtPosition(i).toString();
        if (cadenita.equals("kike")){
            imagenv.setImageResource(R.drawable.kike);
        }else
            if (cadenita.equals("minovia")){
            imagenv.setImageResource(R.drawable.minovia);
        }
            else
                if (cadenita.equals("selecciona")){
                    imagenv.setImageDrawable(null);
                }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}