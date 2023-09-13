package com.example.botonesradio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView vistita;
    RadioGroup rtoditos;
    RadioButton radiecitom, radiecitof;
    Button bdesplegadito, bborradito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vistita = findViewById(R.id.vista);
        rtoditos = findViewById(R.id.radiog);

        radiecitom = findViewById(R.id.masc);
        radiecitof = findViewById(R.id.fem);

        radiecitom.setOnClickListener(this);
        radiecitof.setOnClickListener(this);

        bborradito = findViewById(R.id.botonb);
        bdesplegadito = findViewById(R.id.botond);

        bborradito.setOnClickListener(this);
        bdesplegadito.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String cadenita = ((Button)v).getText().toString();
        Clasesita objetito = new Clasesita();
        if(v instanceof Button){
            if (cadenita.equals("limpiar")){
                rtoditos.clearCheck();
                vistita.setText("");
            }
            else
                if (cadenita.equals("desplegar")){
                    if (radiecitom.isChecked()){
                        Toast.makeText(this, objetito.hombre(), Toast.LENGTH_SHORT).show();
                    }
                    else
                        if (radiecitof.isChecked())
                            Toast.makeText(this, objetito.mujer(), Toast.LENGTH_SHORT).show();
                }
        }
        if (v instanceof RadioButton){
            if (radiecitom.isChecked()){
                vistita.setText(objetito.hombre());
            }
            else
            if (radiecitof.isChecked()){
                vistita.setText(objetito.mujer());
            }
        }
    }
}