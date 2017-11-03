package com.example.dm2.paso_de_parametros;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Actividad4_1 extends AppCompatActivity {

    private String texto,aficiones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4_1);
    }

    public void Enviar(View v){
        RadioButton rb1=(RadioButton)findViewById(R.id.radioHombre);
        RadioButton rb2=(RadioButton)findViewById(R.id.radioMujer);
        CheckBox chMusica=(CheckBox)findViewById(R.id.chMusica);
        CheckBox chDeportes=(CheckBox)findViewById(R.id.chDeportes);
        CheckBox chLectura=(CheckBox)findViewById(R.id.chLectura);
        CheckBox chViajar=(CheckBox)findViewById(R.id.chViajar);
        EditText nombre=(EditText)findViewById(R.id.nombre);
        EditText apellido=(EditText)findViewById(R.id.apellido);

        if (!rb1.isSelected() && !rb2.isSelected()){
            Toast.makeText(this,"Debes seleccionar un sexo",Toast.LENGTH_SHORT).show();
        }else{
            if (nombre.getText().toString().equals("") || apellido.getText().toString().equals("")){
                Toast.makeText(this,"El nombre y el apellido no pueden quedar vacios",Toast.LENGTH_SHORT).show();
            }else{
                if (!chMusica.isSelected() && !chDeportes.isSelected() && !chLectura.isSelected() && !chViajar.isSelected() ){
                    aficiones="Sin aficiones";
                }else{
                    aficiones="Tus aficiones son: ";
                    aficiones+=chMusica.getText().toString();
                    aficiones+=chViajar.getText().toString();
                    aficiones+=chDeportes.getText().toString();
                    aficiones+=chLectura.getText().toString();
                }
                texto+="Tu nombre es "+nombre.getText().toString()+" y tu apellido "+apellido.getText().toString();
                texto+=" "+aficiones;

                Intent intento=new Intent(Actividad4_1.this, Actividad4_2.class);
                startActivity(intento);
                intento.putExtra("texto",texto);
            }
        }
    }
}
