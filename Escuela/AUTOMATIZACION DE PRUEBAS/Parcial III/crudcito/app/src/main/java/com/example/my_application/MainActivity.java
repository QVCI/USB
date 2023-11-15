package com.example.my_application;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etcodigo, etdescripcion, etprecio;
    Button baltas, bbajas, bcambios, bconsultas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etcodigo =findViewById(R.id.ecodigo);
        etdescripcion =findViewById(R.id.edescripcion);
        etprecio =findViewById(R.id.eprecio);

        baltas = findViewById(R.id.altas);
        bbajas = findViewById(R.id.bajas);
        bcambios = findViewById(R.id.cambios);
        bconsultas = findViewById(R.id.consultas);

        baltas.setOnClickListener(this);
        bbajas.setOnClickListener(this);
        bcambios.setOnClickListener(this);
        bconsultas.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        String cadenita = ((Button)view).getText().toString();
        if (cadenita.equals("altas"))
        {
            limpiezaaltas();
        }
        else
        {
            if(cadenita.equals("agregar"))
            {
                Base admin = new Base(this, "administrador", null, 1);
                SQLiteDatabase basedatos = admin.getWritableDatabase();
                String cod =etcodigo.getText().toString();
                String des =etdescripcion.getText().toString();
                String pre =etprecio.getText().toString();


                ContentValues registro = new ContentValues();
                registro.put("codigo", cod);
                registro.put("descripcion", des);
                registro.put("precio", pre);
                basedatos.insert("articulos", null, registro);
                basedatos.close();
                Toast.makeText(this, "agregado", Toast.LENGTH_LONG).show();
                limpiezaagregar();
            }
            else
            {
                if(cadenita.equals("consultas"))
                {
                    limpiezaconsultas();

                }
                else
                {
                    if (cadenita.equals("buscar"))
                    {
                        String mensajito = "";
                        Base admin = new Base(this, "administracion", null, 1);
                        SQLiteDatabase basededatos = admin.getReadableDatabase();
                        String codiguito = etcodigo.getText().toString();
                        Cursor fila = basededatos.rawQuery("select descripcion, " +
                                        "precio from articulos where codigo = " + codiguito,
                                null);
                        if (fila.moveToFirst())
                        {
                            etdescripcion.setText(fila.getString(0));
                            etprecio.setText(String.valueOf(fila.getInt(1)));
                            mensajito = "estos son los datos";
                            basededatos.close();
                        }
                        else
                        {
                            mensajito = "no existe el registre";
                        }
                        AlertDialog.Builder mensa = new AlertDialog.Builder(this);
                        mensa.setTitle("hola");
                        mensa.setMessage(mensajito);
                        mensa.setPositiveButton("aceptar", null);
                        AlertDialog dialog = mensa.create();
                        dialog.show();
                        bconsultas.setText("restaurar");
                    }
                }
            }

        }
    }
    private void limpiezaaltas()
    {
        baltas.setText("agregar");
        bbajas.setEnabled(false);
        bcambios.setEnabled(false);
        bconsultas.setEnabled(false);
        etcodigo.setEnabled(true);
        etdescripcion.setEnabled(true);
        etprecio.setEnabled(true);
        etcodigo.requestFocus();

    }
    private void limpiezaagregar()
    {
        etcodigo.setText("");
        etdescripcion.setText("");
        etprecio.setText("");
        etcodigo.setEnabled(false);
        etdescripcion.setEnabled(false);
        etprecio.setEnabled(false);
        bbajas.setEnabled(true);
        bcambios.setEnabled(true);
        bconsultas.setEnabled(true);
        baltas.setText("altas");
    }
    private void limpiezaconsultas()
    {
        baltas.setEnabled(false);
        bbajas.setEnabled(false);
        bcambios.setEnabled(false);
        bconsultas.setEnabled(true);
        etcodigo.setEnabled(true);
        bconsultas.setText("buscar");
        etcodigo.requestFocus();
    }

}