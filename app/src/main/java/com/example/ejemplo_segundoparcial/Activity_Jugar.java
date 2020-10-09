package com.example.ejemplo_segundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.ejemplo_segundoparcial.Activity_Puntaje.listajugadores;

public class Activity_Jugar extends AppCompatActivity implements View.OnClickListener {

    public static String Nom;
    public static int Dif;
    TextView txtNick, txtNivel;
    EditText txtNumero;
    Button btnJugar;

    private int NumeroAleaorio = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__jugar);

        txtNick = findViewById(R.id.nick1);
        txtNivel = findViewById(R.id.nivel1);
        btnJugar = findViewById(R.id.btnJugar);
        txtNumero = findViewById(R.id.txtNumero);
        int posicion = listajugadores.size();

       // Toast.makeText(this,listajugadores.get(posicion - 1).getNombre(),Toast.LENGTH_LONG).show();

        txtNick.setText(listajugadores.get(posicion - 1).getNombre());

        if (listajugadores.get(posicion - 1).getDificultad() == 1){
            NumeroAleaorio = (int)(Math.random() * 10);
            txtNivel.setText("Facil");
        }else if (listajugadores.get(posicion - 1).getDificultad() == 2){
            NumeroAleaorio = (int)(Math.random() * 50);
            txtNivel.setText("Medio");
        }else if (listajugadores.get(posicion - 1).getDificultad() == 3){
            NumeroAleaorio = (int)(Math.random() * 100);
            txtNivel.setText("Dificil");
        }

        btnJugar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnJugar:{
              //  if (NumeroAleaorio ==  txtNumero.getText())
            }
            break;
        }
    }
}
