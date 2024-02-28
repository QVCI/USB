package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class Calculador extends AppCompatActivity {
    EditText num1;
    EditText num2;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menucito, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        calculos  calculos = new  calculos();
        if (item.getItemId() == R.id.sumar)
        {
            int numero1 = 0;
            int numero2 = 0;

             numero1 = Integer.parseInt(num1.getText().toString());
             numero2 = Integer.parseInt(num2.getText().toString());
            double resultado = 0;
            String r ="";
            resultado = calculos.suma(numero1, numero2);
            r = String.valueOf(resultado);
            Toast.makeText(this, r, Toast.LENGTH_SHORT).show();

        }
        if (item.getItemId() == R.id.restar)
        {
            int numero1 = 0;
            int numero2 = 0;
            double resultado = 0;
            String r ="";
            numero1 = Integer.parseInt(num1.getText().toString());
            numero2 = Integer.parseInt(num2.getText().toString());
            resultado = calculos.resta(numero1, numero2);
            r = String.valueOf(resultado);
            Toast.makeText(this, r, Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.multiplicacion)
        {
            int numero1 = 0;
            int numero2 = 0;
            double resultado = 0;
            String r ="";
            numero1 = Integer.parseInt(num1.getText().toString());
            numero2 = Integer.parseInt(num2.getText().toString());
            resultado = calculos.multi(numero1, numero2);
            r = String.valueOf(resultado);
            Toast.makeText(this, r, Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.dividir)
        {
            int numero1 = 0;
            int numero2 = 0;
            double resultado = 0;
            String r ="";
            numero1 = Integer.parseInt(num1.getText().toString());
            numero2 = Integer.parseInt(num2.getText().toString());
            resultado = calculos.divide(numero1, numero2);
            r = String.valueOf(resultado);
            Toast.makeText(this, r, Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculador);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
    }
}