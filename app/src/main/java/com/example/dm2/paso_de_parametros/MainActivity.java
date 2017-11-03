package com.example.dm2.paso_de_parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ejercicio1(View v){
        Intent intento=new Intent(MainActivity.this, Actividad1.class);
        startActivity(intento);
    }

    public void Ejercicio2(View v){
        Intent intento=new Intent(MainActivity.this, Actividad2_1.class);
        startActivity(intento);
    }

    public void Ejercicio3(View v){
        Intent intento=new Intent(MainActivity.this, Actividad3_1.class);
        startActivity(intento);
    }

    public void Ejercicio4(View v){
        Intent intento=new Intent(MainActivity.this, Actividad4_1.class);
        startActivity(intento);
    }



}
