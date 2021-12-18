package com.example.adicao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtnumero1;
    EditText edtnumero2;
    EditText edtnumero3;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnumero1 = findViewById(R.id.edtnumero1);
        edtnumero2 = findViewById(R.id.edtnumero2);
        edtnumero3 = findViewById(R.id.edtnumero3);
        txtResultado =  findViewById(R.id.txtResultado);

    }
    public void SOMAR (View view){
        double n1 = Double.parseDouble(edtnumero1.getText().toString());
        double n2 = Double.parseDouble(edtnumero2.getText().toString());
        double n3 = Double.parseDouble(edtnumero3.getText().toString());
        double x = n1 + n2 + n3;
        txtResultado.setText("Soma é:" + x);

    }
}