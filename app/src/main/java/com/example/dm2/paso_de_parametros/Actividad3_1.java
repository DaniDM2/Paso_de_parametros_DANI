package com.example.dm2.paso_de_parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad3_1 extends AppCompatActivity {

    private EditText e1,e2,res;
    private int num1,num2,aciertos,fallos;
    private String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3_1);

        e1=(EditText)findViewById(R.id.n1);
        e2=(EditText)findViewById(R.id.n2);
         num1= (int) (Math.random()*101);
         num2= (int) (Math.random()*101);

        e1.setText(Integer.toString(num1));
        e2.setText(Integer.toString(num2));



            aciertos=0;
            fallos=0;
            TextView t1=(TextView)findViewById(R.id.correctas);
            t1.setText(t1.getText()+Integer.toString(aciertos));
            TextView t2=(TextView)findViewById(R.id.fallidas);
            t2.setText(t2.getText()+Integer.toString(fallos));

    }

    public void Comprobar(View v){
       EditText e1=(EditText)findViewById(R.id.res);
      int result=num1+num2;

        Intent intento=new Intent(Actividad3_1.this, Actividad3_2.class);

        if (e1.getText().toString().equalsIgnoreCase(Integer.toString(result))){
            intento.putExtra("operacion","correcta");
            aciertos++;
        }
        else{
            intento.putExtra("operacion","erroneo");
            fallos++;
        }
        intento.putExtra("aciertos",aciertos);
        intento.putExtra("fallos",fallos);
        Log.e("IEEE","aciertos ="+aciertos+" Fallos= "+fallos);

        startActivityForResult(intento,17);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==17 && resultCode==RESULT_OK){
            TextView t1=(TextView)findViewById(R.id.correctas);
            TextView t2=(TextView)findViewById(R.id.fallidas);

            String str=t1.getText().toString();
            String[] stre=str.split(":");
            ///AQUIII MIRAR PAGINA 78 APUNTES RESULTT
            t1.setText(stre[0]+":"+data.getExtras().getInt("aciertos"));

            String str1=t2.getText().toString();
            String[] stre1=str1.split(":");
            t2.setText(stre1[0]+":"+data.getExtras().getInt("fallos"));
        }
    }
}
