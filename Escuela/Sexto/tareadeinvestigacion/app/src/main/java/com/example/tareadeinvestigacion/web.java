package com.example.tareadeinvestigacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class web extends AppCompatActivity implements View.OnClickListener {
    private WebView webView;
    private Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = findViewById(R.id.vistaweb);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://stackoverflow.com/questions/4275678/how-to-make-a-phone-call-using-intent-in-android");

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