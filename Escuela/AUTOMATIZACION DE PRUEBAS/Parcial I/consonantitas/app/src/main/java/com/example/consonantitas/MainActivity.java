package com.example.consonantitas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editadito;
    Button botoncito;
    Button botoncito2;
    Button botoncito3;
    String textoboton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botoncito = findViewById(R.id.conson);
        botoncito2 = findViewById(R.id.numeritos);
        botoncito.setOnClickListener(this);
        botoncito2.setOnClickListener(this);
        editadito = findViewById(R.id.texto);
        botoncito3 = findViewById(R.id.vocales);
        botoncito3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Clasesita objetito = new Clasesita();
        textoboton = ((Button)view).getText().toString();
        if (textoboton.equals("consonantes")){
            objetito.setCadenitas(editadito.getText().toString());
            Toast.makeText(this, "consonantes: " + objetito.cuantas(), Toast.LENGTH_SHORT).show();
        }
        if (textoboton.equals("numeros")){
            objetito.setCadenitas(editadito.getText().toString());
            Toast.makeText(this, "numeros: " + objetito.numeros(), Toast.LENGTH_SHORT).show();
        }
        if (textoboton.equals("vocales")){
            objetito.setCadenitas(editadito.getText().toString());
            Toast.makeText(this, "vocales: " + objetito.vocales(), Toast.LENGTH_SHORT).show();
        }
    }
}