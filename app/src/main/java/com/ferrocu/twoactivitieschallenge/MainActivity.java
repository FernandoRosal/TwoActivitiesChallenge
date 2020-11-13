package com.ferrocu.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bTexto1;
    private Button bTexto2;
    private Button bTexto3;
    private Intent intent;
    private String titulo;

    private String cadena;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bTexto1=(Button) findViewById(R.id.bText1);
        bTexto2=(Button) findViewById(R.id.bText2);
        bTexto3=(Button) findViewById(R.id.bText3);

        bTexto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo=getString(R.string.titulo_gladiator);
                cadena=getString(R.string.gladiator);
                intent = new Intent(MainActivity.this,Second.class);
                intent.putExtra("titulo",titulo);
                intent.putExtra("cadena",cadena);
                startActivity(intent);

            }
        });

        bTexto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo=getString(R.string.tiulo_300);
                cadena=getString(R.string.trescientos);
                intent = new Intent(MainActivity.this,Second.class);
                intent.putExtra("titulo",titulo);
                intent.putExtra("cadena",cadena);
                startActivity(intent);

            }
        });

        bTexto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo=getString(R.string.titlo_reino_cielos);
                cadena=getString(R.string.reino_cielos);
                intent = new Intent(MainActivity.this,Second.class);
                intent.putExtra("titulo",titulo);
                intent.putExtra("cadena",cadena);
                startActivity(intent);

            }
        });
    }
}