package com.example.dm2.paso_de_parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {
    private EditText edNombre;
    private EditText edApellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        Bundle extras= getIntent().getExtras();
        if (extras!=null){
            String condiciones=extras.getString("condiciones");
            String nom=extras.getString("nombre");
            String ap=extras.getString("apellido");

            TextView txt= (TextView) findViewById(R.id.resultado);
            txt.setText(txt.getText()+condiciones);

            EditText e1=(EditText)findViewById(R.id.editText2);
            EditText e2=(EditText)findViewById(R.id.editText);
            e1.setText(nom);
            e2.setText(ap);
        }

    }

    public void Validar(View v){
        edNombre=(EditText)findViewById(R.id.editText2);
        edApellido=(EditText)findViewById(R.id.editText);

        Intent intento=new Intent(Actividad1.this, Actividad1_2.class);
        intento.putExtra("nombre",edNombre.getText().toString());
        intento.putExtra("apellido",edApellido.getText().toString());

        startActivity(intento);
    }
}
