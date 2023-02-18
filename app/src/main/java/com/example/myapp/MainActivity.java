package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView RESULTADO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        RESULTADO = findViewById(R.id.RESULTADO);
    }

    public void calcularimc(View view){
        double ps = Double.parseDouble(editPeso.getText().toString());
        double alt = Double.parseDouble(editAltura.getText().toString());
        double resultado = ps / (alt*alt);

    }
}