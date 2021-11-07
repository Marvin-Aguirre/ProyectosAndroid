package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResultado;
    private float num1=0.0f;
    private float numFirst=0.0f;
    private float num2=0.0f;
    private String op="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado=(TextView) findViewById(R.id.textViewResultado);

    }

    public void  EscribirNum(View view){
        num1=Float.parseFloat(textViewResultado.getText().toString());
        if(num1==0.0f){

            Button b = (Button)view;
            String text = b.getText().toString();
            textViewResultado.setText(text);

        }else{
            Button b = (Button)view;
            String text = b.getText().toString();
            textViewResultado.setText(textViewResultado.getText()+text);
        }
    }

    public void VaciarDatos(View view){
        textViewResultado.setText("0");
        num1=0.0f;
        num2=0.0f;
        op="";
    }

    public  void Operacion(View view){
        numFirst=Float.parseFloat(textViewResultado.getText().toString());
        Button b = (Button)view;
        String text = b.getText().toString();


        op=text;
        textViewResultado.setText("0");


    }

    public  void mostrarResultado(View view){
        num2=Float.parseFloat(textViewResultado.getText().toString());
        if (op.equals("/")){
            if(num2==0.0f){
                textViewResultado.setText("Error!");
            }else{
                float resultado=numFirst / num2;
                textViewResultado.setText(resultado+"");
            }
        }else if(op.equals("+")){
            float resultado=numFirst + num2;
            textViewResultado.setText(resultado+"");
        }else if(op.equals("-")){
            float resultado=numFirst - num2;
            textViewResultado.setText(resultado+"");
        }else if(op.equals("*")){
            float resultado=numFirst * num2;
            textViewResultado.setText(resultado+"");
        }
        num1=0.0f;
        num2=0.0f;
        numFirst=0.0f;
        op="";
    }
    public  void irInfo(View view){
        startActivity(new Intent(MainActivity.this,InfoActivity.class));
    }
}