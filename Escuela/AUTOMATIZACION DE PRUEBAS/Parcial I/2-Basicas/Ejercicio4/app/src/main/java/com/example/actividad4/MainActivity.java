package com.example.actividad4;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText campo;
    Button local;
    Button nacional;
    Button internacional;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo = findViewById(R.id.campo);
        local = findViewById(R.id.local);
        nacional = findViewById(R.id.nacional);
        internacional = findViewById(R.id.internacional);
        local.setOnClickListener(this);
        nacional.setOnClickListener(this);
        internacional.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String textoboton = ((Button)v).getText().toString();
        Tarifas tarifas = new Tarifas();
        tarifas.setDuracion(Integer.parseInt(campo.getText().toString()));
        if (textoboton.equals("local"))
            Toast.makeText(this, "costo llamada: " + tarifas.local(), Toast.LENGTH_SHORT).show();

        if (textoboton.equals("nacional"))
            Toast.makeText(this, "costo llamada: " + tarifas.nacional(), Toast.LENGTH_SHORT).show();

        if (textoboton.equals("internacional"))
            Toast.makeText(this, "costo llamada: " + tarifas.internacional(), Toast.LENGTH_SHORT).show();
    }
}