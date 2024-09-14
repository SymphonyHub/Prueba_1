package com.example.appandroid;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraIMC extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_imc); // Enlazamos el layout

        // Para referenciar los componentes de la vista
        EditText editTextPeso = findViewById(R.id.editTextPeso);
        EditText editTextAltura = findViewById(R.id.editTextAltura);
        TextView textViewIMC = findViewById(R.id.textViewIMC);
        Button btnCalcular = findViewById(R.id.btnCalcular);

        // Acción cuando se presiona el botón de calcular
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores ingresados
                double peso = Double.parseDouble(editTextPeso.getText().toString());
                double altura = Double.parseDouble(editTextAltura.getText().toString());

                // Calcular el IMC
                double imc = peso / (altura * altura);

                // Mostrar el resultado en el TextView
                textViewIMC.setText("Su IMC es: " + imc);
            }
        });
    }
}
