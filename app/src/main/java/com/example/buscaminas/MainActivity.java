package com.example.buscaminas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.concurrent.TimeUnit;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {
    public int b;
    public int cont = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();
   }


    public void iniciar()
    {

        //IDENTIFICAR EL TEXTVIEW
        final TextView contador = (TextView)findViewById(R.id.Contador);
        //IDENTIFICAR LOS BOTONES
        Button botuno = (Button) findViewById(R.id.btnuno);
        Button botdos= (Button) findViewById(R.id.btndos);
        Button bottres=(Button) findViewById(R.id.btntres);
        Button botcuatro=(Button) findViewById(R. id.btncuatro);
        Button botcinco=(Button)findViewById(R.id.btncinco);
        Button botseis=(Button)findViewById(R.id.btnseis);
        Button botsiete=(Button)findViewById(R.id.btnsiete);
        Button botocho=(Button)findViewById(R.id.btnocho);
        Button botnueve=(Button)findViewById(R.id.btnnueve);
        Button botdiez=(Button)findViewById(R.id.btndiez);
        Button botonce=(Button)findViewById(R.id.btnonce);
        Button botdoce=(Button)findViewById(R.id.btndoce);
        Button bottrece=(Button)findViewById(R.id.btntrece);
        Button botcatorce=(Button)findViewById(R.id.btncatorce);
        Button botquince=(Button)findViewById(R.id.btnquince);
        Button botdieciseis=(Button)findViewById(R.id.btndiesiseois);
        Button botdiecisiete=(Button)findViewById(R.id.btndiesisiete);
        Button botdieciocho=(Button)findViewById(R.id.btndiesocho);
        Button botdiecinueve=(Button)findViewById(R.id.btndiesinueve);
        Button botveinte=(Button)findViewById(R.id.btnveinte);
        //ARREGLOS DE BOTONES
        final Button[] espacios = {botuno, botdos, bottres, botcuatro, botcinco, botseis,botsiete, botocho, botnueve, botdiez, botonce, botdoce, bottrece, botcatorce, botquince,botdieciseis,botdiecisiete, botdieciocho, botdiecinueve, botveinte};
        //ARREGLOS DE NUMEROS
        final int [] num= new int[20];
        for(int i = 0; i <20 ; i++)num[i]= 0;
        //NUMEROS ALEATORIOS
        for(int c=0; c<=19; c++) {
            int ran = (int)(Math.random() * 3 + 1);
            num[c] = ran;
        }

        cont=0;
        contador.setText(""+cont);

        for (b =0 ;b <20 ;b++){
            final int caramelo = b;//PASAR EL NUMERO(CANCION DE OZUNA)
           //PARA ABRIR EL EVENTO
            espacios[b].setText("");
            espacios[b].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (num[caramelo]!=3)
                    {//CONTADOR
                        cont+=num[caramelo];
                        contador.setText(""+cont);
                        //MUESTRA LOS NUMEROS
                        espacios[caramelo].setText(""+num[caramelo]);
                        num[caramelo]=0;
                        espacios[caramelo].setEnabled(false);
                    }else{
                           //MUESTRA LA X Y EL MENSAJE DE PERDER
                        espacios[caramelo].setText("X");
                        Toast.makeText(MainActivity.this, "Perdiste", Toast.LENGTH_LONG).show();
                        reiniciar();
                    }
                    //Toast.makeText(MainActivity.this, "Hola soy el boton: "+caramelo, Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    public void reiniciar(){
        iniciar();
    }
}

