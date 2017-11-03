package com.example.dm2.paso_de_parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad3_2 extends AppCompatActivity {

    String operacion;
    int aciertos,fallos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3_2);

        Bundle extras= getIntent().getExtras();
        operacion=extras.getString("operacion");
        aciertos=extras.getInt("aciertos");
        fallos=extras.getInt("fallos");
        TextView t1= (TextView) findViewById(R.id.txt1);
        t1.setText(t1.getText()+operacion);

    }

    public void Volver(View v){
        Intent intento=new Intent();
        intento.putExtra("aciertos",aciertos);
        intento.putExtra("fallos",fallos);
        setResult(RESULT_OK,intento);
        finish();
    }
}
