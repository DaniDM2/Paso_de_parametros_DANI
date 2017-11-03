package com.example.dm2.paso_de_parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad2_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2_2);

        Bundle extras= getIntent().getExtras();
        String usuario=extras.getString("usuario");
        String pass=extras.getString("pass");

        TextView e1=(TextView)findViewById(R.id.mensaje);

        if(usuario.equalsIgnoreCase("dani") && pass.equalsIgnoreCase("1234")){
            e1.setText("El usuario y la password son correctas");
        }else
            e1.setText("El usuario y la password son incorrectas");
    }


    void Volver(View v){
        Intent intento=new Intent(Actividad2_2.this, Actividad2_1.class);

        startActivity(intento);
    }
}
