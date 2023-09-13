package com.example.combocalculadora;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner combo;
    EditText entrada1;
    EditText entrada2;
    String textocombo[] = {"selecciona", "suma", "resta", "multiplicacion", "division"};
    ArrayAdapter adaptado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adaptado = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, textocombo);
        entrada1 = findViewById(R.id.entrada1);
        entrada2 = findViewById(R.id.entrada2);
        combo = findViewById(R.id.selector);
        combo.setOnItemSelectedListener(this);
        combo.setAdapter(adaptado);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String seleccionado = adapterView.getItemAtPosition(i).toString();
        Calculadora calculadora = new Calculadora();
        if (seleccionado.equals("suma")) {
            calculadora.setNumero1(Integer.parseInt(entrada1.getText().toString()));
            calculadora.setNumero2(Integer.parseInt(entrada2.getText().toString()));
            Toast.makeText(this, calculadora.getNumero1() + "+"
                    + calculadora.getNumero2() + "=" + calculadora.suma(), Toast.LENGTH_SHORT).show();
        } else if (seleccionado.equals("resta")) {
            calculadora.setNumero1(Integer.parseInt(entrada1.getText().toString()));
            calculadora.setNumero2(Integer.parseInt(entrada2.getText().toString()));
            Toast.makeText(this, calculadora.getNumero1() + "-"
                    + calculadora.getNumero2() + "=" + calculadora.resta(), Toast.LENGTH_SHORT).show();
        } else if (seleccionado.equals("multiplicacion")) {
            calculadora.setNumero1(Integer.parseInt(entrada1.getText().toString()));
            calculadora.setNumero2(Integer.parseInt(entrada2.getText().toString()));
            Toast.makeText(this, calculadora.getNumero1() + "*"
                    + calculadora.getNumero2() + "=" + calculadora.multiplica(), Toast.LENGTH_SHORT).show();
        }else if (seleccionado.equals("division")) {
            calculadora.setNumero1(Integer.parseInt(entrada1.getText().toString()));
            calculadora.setNumero2(Integer.parseInt(entrada2.getText().toString()));
            Toast.makeText(this, calculadora.getNumero1() + "/"
                    + calculadora.getNumero2() + "=" + calculadora.divide(), Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onNothingSelected (AdapterView<?> adapterView) {
    }
}