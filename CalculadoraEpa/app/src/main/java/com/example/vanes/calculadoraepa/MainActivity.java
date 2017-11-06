package com.example.vanes.calculadoraepa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public double numeroA, numeroB;
    public String cadenaA, cadenaB;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText a = (EditText)findViewById(R.id.numeroA);
        final EditText b = (EditText)findViewById(R.id.numeroB);
        final TextView respuesta = (TextView)findViewById(R.id.resultado);

        //Realizando Eventos
        Button sumar = (Button)findViewById(R.id.suma);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              cadenaA =  a.getText().toString();
              cadenaB =  b.getText().toString();
              numeroA = Double.parseDouble(cadenaA);
              numeroB = Double.parseDouble(cadenaB);
              resultado = Suma(numeroA,numeroB);
              respuesta.setText(""+resultado+"");

            }
        });

        Button restar = (Button)findViewById(R.id.resta);

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadenaA =  a.getText().toString();
                cadenaB =  b.getText().toString();
                numeroA = Double.parseDouble(cadenaA);
                numeroB = Double.parseDouble(cadenaB);
                resultado = Resta(numeroA,numeroB);
                respuesta.setText(""+resultado+"");

            }
        });

        Button multiplicacion = (Button)findViewById(R.id.multiplicar);

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadenaA =  a.getText().toString();
                cadenaB =  b.getText().toString();
                numeroA = Double.parseDouble(cadenaA);
                numeroB = Double.parseDouble(cadenaB);
                resultado = Multiplicar(numeroA,numeroB);
                respuesta.setText(""+resultado+"");

            }
        });

        Button division = (Button)findViewById(R.id.dividir);

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadenaA =  a.getText().toString();
                cadenaB =  b.getText().toString();
                numeroA = Double.parseDouble(cadenaA);
                numeroB = Double.parseDouble(cadenaB);
                resultado = Dividir(numeroA,numeroB);
                respuesta.setText(""+resultado+"");

            }
        });

    }

    public double Suma(double a, double b){ return (a+b);}
    public double Resta(double a, double b){ return(a-b);}
    public double Multiplicar(double a, double b){return(a*b);}
    public double Dividir(double a, double b){
        double division;
        try{
            division=a/b;
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "División por cero", Toast.LENGTH_SHORT ).show();
            division = Double.MAX_VALUE; //Le asigan infinito a la variable que va a retornar
        }
        return division;
    }
}
