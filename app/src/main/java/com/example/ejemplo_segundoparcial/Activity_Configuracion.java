package com.example.ejemplo_segundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Entidades.objeto;

import static com.example.ejemplo_segundoparcial.Activity_Puntaje.listajugadores;

public class Activity_Configuracion extends AppCompatActivity implements View.OnClickListener {

    //variables estaticas para llamarlas desde otras activitys de forma facil, solo implementandolas
    //public static List<objeto> listajugadores = new ArrayList<>();
    public static int correlativojugadoractual;

    EditText txtNick;
    RadioButton rbFacil, rbMedio, rbDificil;
    Button btnGuardar;
    int Dificultad = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__configuracion);

        txtNick = findViewById(R.id.txtNick);
        rbFacil = findViewById(R.id.rbFacil);
        rbMedio = findViewById(R.id.rbMedio);
        rbDificil = findViewById(R.id.rbDificil);
        btnGuardar = findViewById(R.id.btnGuardar);
        rbFacil.setOnClickListener(this);
        rbMedio.setOnClickListener(this);
        rbDificil.setOnClickListener(this);
        btnGuardar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rbFacil:
                Dificultad = 1;
                break;
            case R.id.rbMedio:
                Dificultad = 2;
                break;
            case R.id.rbDificil:
                Dificultad = 3;
                break;
            case R.id.btnGuardar: {
                if (txtNick.getText().length() != 0) {
                    objeto _objeto = new objeto();
                    _objeto.setNombre(txtNick.getText().toString());
                    _objeto.setDificultad(Dificultad);
                    _objeto.setIntentos(0);
                    listajugadores.add(_objeto);
                    Intent RetornarDatos = new Intent();
                    RetornarDatos.putExtra("Nombre", txtNick.getText());
                    RetornarDatos.putExtra("Dificultad", Dificultad);
                    setResult(RESULT_OK, RetornarDatos);
                    finish();
                } else {
                    Toast.makeText(this, "No puede estar vacio el nombre", Toast.LENGTH_LONG).show();
                }
            }
            break;
            default:
                break;
        }
    }

}
