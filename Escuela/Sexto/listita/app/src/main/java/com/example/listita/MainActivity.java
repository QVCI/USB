package com.example.listita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    Button regresar;
    String deportescomenta[] = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
    String deporteslista[] = {"carreras","carreras2","correr","cuera","dep","depo1","depo2","fucho","fucha2","gim"};









    int deporteimagenes[] = {R.drawable.a_1,R.drawable.a_2,R.drawable.a_3,
            R.drawable.a_4,R.drawable.a_5,R.drawable.a_6,
            R.drawable.a_7,R.drawable.a_8,R.drawable.a_9,R.drawable.a_10};
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.vistitas);
        listview.setOnItemClickListener(this);
        Adaptador adaptador = new Adaptador(getApplicationContext(), deporteslista,deportescomenta,deporteimagenes);
        listview.setAdapter(adaptador);
        regresar = findViewById(R.id.regresar);
        regresar.setOnClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, String.valueOf(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == regresar.getId())
        {
            Intent menu = new Intent(this, Menu.class);
            startActivity(menu);
            finish();
        }

    }
}