package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listameses;
    Basurita bas;
    ArrayList<String> regreso = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listameses = findViewById(R.id.lista);
        listameses.setOnItemClickListener(this);
        bas = new Basurita();
        regreso = bas.regresa();
        ArrayAdapter <CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, regreso);
        listameses.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        Toast.makeText(this, adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_LONG).show();
    }
}