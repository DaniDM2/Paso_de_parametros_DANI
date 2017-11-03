package com.example.dm2.paso_de_parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Actividad2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2_1);
    }

    void Conectar(View v){ //NO FUNCIONAAAA
        Log.e("mensaje","PEN");
        EditText e1=(EditText)findViewById(R.id.usuario);
        EditText e2=(EditText)findViewById(R.id.contraseña);
        String usu=e1.getText().toString();
        String pass=e2.getText().toString();

        Intent intento=new Intent(Actividad2_1.this, Actividad2_2.class);
        intento.putExtra("usuario",usu);
        intento.putExtra("pass",pass);

        startActivity(intento);
    }
}
