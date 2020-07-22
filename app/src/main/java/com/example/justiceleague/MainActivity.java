package com.example.justiceleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnFlash;
    private ImageButton btnAqua;
    private ImageButton btnWonder;
    private ImageButton btnSuper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFlash = (ImageButton) findViewById(R.id.btnFlash);
        btnAqua = (ImageButton) findViewById(R.id.btnAqua);
        btnWonder = (ImageButton) findViewById(R.id.btnWw);
        btnSuper = (ImageButton) findViewById(R.id.btnSuper);

        btnAqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Aqua.class);

                startActivity(intent);
            }
        });

        btnFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Flashh.class);

                startActivity(intent);
            }
        });

        btnSuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Superman.class);

                startActivity(intent);
            }
        });

        btnWonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Wonder.class);

                startActivity(intent);
            }
        });

    }
}