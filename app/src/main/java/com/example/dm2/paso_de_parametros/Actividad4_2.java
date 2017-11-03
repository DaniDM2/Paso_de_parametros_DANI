package com.example.dm2.paso_de_parametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Actividad4_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4_2);

        Bundle extras= getIntent().getExtras();     ;
        TextView t1= (TextView) findViewById(R.id.textoFinal);
        t1.setText(extras.getString("operacion"));
    }
}
