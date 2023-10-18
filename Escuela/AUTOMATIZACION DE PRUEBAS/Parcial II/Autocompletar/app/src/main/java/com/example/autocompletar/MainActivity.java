package com.example.autocompletar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button botoncito;
    AutoCompleteTextView acvistita;
    TextView vistita;
    String[] nombrecitos = {"Manuel", "Micaela", "Mario", "Morticia", "Magda", "Maite", "Mireya", "Mónica"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botoncito = findViewById(R.id.botoncito);
        botoncito.setText("click");
        acvistita = findViewById(R.id.autoc);

        vistita = findViewById(R.id.tvistita);
        botoncito.setOnClickListener(this);
        ArrayAdapter<String> adapatadorcito = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nombrecitos);
        acvistita.setThreshold(2);
        acvistita.setAdapter(adapatadorcito);
    }

    @Override
    public void onClick(View view) {
        vistita.setText(acvistita.getText());
    }
}