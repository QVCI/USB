package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnKeyListener {
    EditText textito;
    TextView vistita;
    metodos met;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        met = new metodos();
        textito = findViewById(R.id.textito);

        textito.setOnKeyListener(this);
        vistita = findViewById(R.id.vistita);

    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event)
    {
        if(event.getAction() == KeyEvent.ACTION_DOWN) //El metodo esta mal implementado, funciona per tienes que lograr
            //deseleccionar el EditText
        {
            String textote = textito.getText().toString();
            if (textote.length() == 0)
            {
                vistita.setText("");
            }
            else
            {
                if (textote.length()==1)
                {
                    int numero = Integer.parseInt(textito.getText().toString());
                    vistita.setText(met.unacifra(numero));
                }
                else
                {
                    if(textote.length()==2)
                    {
                        int numero = Integer.parseInt(textito.getText().toString());
                        vistita.setText(met.doscifras(textote));
                    }
                }
            }

        }
        return false;
    }
}