package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editadito;
    Button botoncito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editadito = findViewById(R.id.texto);
        botoncito = findViewById(R.id.boton);
        botoncito.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String cadenita = ((Button)v).getText().toString();
        Clasesita objetito = new Clasesita();
        objetito.setCadenita(editadito.getText().toString());
        if(cadenita.equals("vocales")){
            Toast.makeText(this, "Vocales: " + objetito.vocales(), Toast.LENGTH_LONG).show();

        }
    }
}