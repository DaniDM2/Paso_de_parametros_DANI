package com.example.dm2.paso_de_parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1_2 extends AppCompatActivity {

    String nombre;
    String apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1_2);

        Bundle extras= getIntent().getExtras();
        nombre=extras.getString("nombre");
        apellido=extras.getString("apellido");

        TextView txt= (TextView) findViewById(R.id.mensaje);
        txt.setText("Hola "+nombre+" "+apellido+" ¿Aceptas la condiciones?");
    }

    void Acepta(View v){
        Intent intento=new Intent(Actividad1_2.this, Actividad1.class);
        intento.putExtra("condiciones","Acepta");
        intento.putExtra("nombre",nombre);
        intento.putExtra("apellido",apellido);

        startActivity(intento);
    }

    void Rechaza(View v){
        Intent intento=new Intent(Actividad1_2.this, Actividad1.class);
        intento.putExtra("condiciones","Rechaza");
        intento.putExtra("nombre",nombre);
        intento.putExtra("apellido",apellido);

        startActivity(intento);
    }
}
