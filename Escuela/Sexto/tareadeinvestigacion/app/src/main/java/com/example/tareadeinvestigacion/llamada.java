package com.example.tareadeinvestigacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class llamada extends AppCompatActivity implements View.OnClickListener {

    private static final int PERMISSION_REQUEST_CALL_PHONE = 1;

    Button regresar;
    ImageButton llamar;
    EditText telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamada);

        regresar = findViewById(R.id.regresar);
        llamar = findViewById(R.id.llamar);
        telefono = findViewById(R.id.telefono);

        llamar.setOnClickListener(this);
        regresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == llamar.getId()) {
            if (ContextCompat.checkSelfPermission(llamada.this, Manifest.permission.CALL_PHONE)
                    != PackageManager.PERMISSION_GRANTED) {

                ActivityCompat.requestPermissions(llamada.this,
                        new String[]{Manifest.permission.CALL_PHONE},
                        PERMISSION_REQUEST_CALL_PHONE);
            } else {

                hacerLlamada();
            }
        } else if (v.getId() == regresar.getId()) {
            Intent Main = new Intent(this, MainActivity.class);
            startActivity(Main);
            finish();
        }
    }

    private void hacerLlamada() {
        String numero = telefono.getText().toString().trim();
        if (!numero.isEmpty()) {
            String uri = "tel:" + numero;
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse(uri));
            startActivity(intent);
        } else {
            Toast.makeText(this, "Ingrese un número", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_REQUEST_CALL_PHONE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                hacerLlamada();
            } else {

                Toast.makeText(this, "Permiso de llamada telefónica denegado", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
