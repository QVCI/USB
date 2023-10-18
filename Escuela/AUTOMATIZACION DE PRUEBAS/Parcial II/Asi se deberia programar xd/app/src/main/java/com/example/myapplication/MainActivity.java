package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textoentrada;
    TextView texto;
    Metodos metodos = new Metodos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoentrada = findViewById(R.id.textoentrada);
        texto = findViewById(R.id.texto);  // Asegúrate de que el TextView tenga el ID "texto" en tu layout XML.

        textoentrada.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                texto.setText("Ingrese números");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String input = textoentrada.getText().toString();
                if (input.length() == 0) {
                    texto.setText("");
                }
                else
                {
                    if (input.length() == 1)
                    {
                        int numero = Integer.parseInt(textoentrada.getText().toString());
                        texto.setText(metodos.unacifra(numero));
                    }
                    else
                    {
                        if (input.length() == 2)
                        {
                            int numero = Integer.parseInt(textoentrada.getText().toString());
                            texto.setText(metodos.doscifras(input));
                        }
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }
}
