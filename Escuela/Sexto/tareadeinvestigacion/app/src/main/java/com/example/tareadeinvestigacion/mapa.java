package com.example.tareadeinvestigacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.maps.GoogleMap;

public class mapa extends AppCompatActivity implements View.OnClickListener {
    private WebView webView;
    private Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        webView = findViewById(R.id.vistaweb);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com.mx/maps/@19.4664712,-99.1788312,15z?entry=ttu");

        atras = findViewById(R.id.atras);
        atras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == atras.getId())
        {
            Intent Main = new Intent(this, MainActivity.class);
            startActivity(Main);
            finish();
        }
    }
}