package com.example.comboimagenes;

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
    String imagenes [] = {"selecciona","Kiruko", "Makima", "Gojo"};
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


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String cadenita =  adapterView.getItemAtPosition(i).toString();

        if (cadenita.equals("Kiruko")){
            imagenv.setImageResource(R.drawable.kiruko);

        }else
        if (cadenita.equals("Makima")){
            imagenv.setImageResource(R.drawable.makima);
        }
        else
        if (cadenita.equals("Gojo")){
            imagenv.setImageResource(R.drawable.gojo);
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