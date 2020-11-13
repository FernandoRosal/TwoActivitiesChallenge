package com.ferrocu.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    private TextView titulo;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        titulo = (TextView) findViewById(R.id.tvTitulo);
        texto = (TextView) findViewById(R.id.tvTexto);

        Intent intent = getIntent();

        String tit = intent.getStringExtra("titulo");
        String cad = intent.getStringExtra("cadena");
        titulo.setText(tit);
        texto.setText(cad);
    }
}