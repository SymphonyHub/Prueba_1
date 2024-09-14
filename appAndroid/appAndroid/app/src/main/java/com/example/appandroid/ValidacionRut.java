package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ValidacionRut extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacion_rut);

        // Referencias a los componentes de la vista
        EditText editTextRut = findViewById(R.id.editTextRut);
        TextView textViewResultado = findViewById(R.id.textViewResultado);
        Button btnValidar = findViewById(R.id.btnValidar);

        // Acción para cuando se presiona el botón de validar
        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rut = editTextRut.getText().toString();
                // Aquí llamamos a la función que valida el RUT
                boolean esValido = validarRUT(rut);

                // Mostramos el resultado en el TextView
                if (esValido) {
                    textViewResultado.setText("RUT válido");
                } else {
                    textViewResultado.setText("RUT inválido");
                }
            }
        });
    }

    // Función para validar el RUT
    private boolean validarRUT(String rut) {
        // Aquí colocaremos la lógica de validación del RUT (simplificada)
        // Lógica para validar formato básico de RUT (simplificado)
        return rut.length() >= 8 && rut.length() <= 10;
    }
}

