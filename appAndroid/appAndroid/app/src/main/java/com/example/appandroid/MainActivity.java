package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Botón para la validación del RUT
        Button btnRut = findViewById(R.id.btnRut);
        btnRut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Para ir hacia la actividad de Validación de RUT
                Intent intent = new Intent(MainActivity.this, ValidacionRut.class);
                startActivity(intent);
            }
        });

        // Botón para la calculadora de IMC
        Button btnIMC = findViewById(R.id.btnIMC);
        btnIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Para ir hacia la actividad de Calculadora de IMC
                Intent intent = new Intent(MainActivity.this, CalculadoraIMC.class);
                startActivity(intent);
            }
        });
    }
}
