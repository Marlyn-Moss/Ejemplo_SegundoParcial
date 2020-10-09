package com.example.ejemplo_segundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Entidades.objeto;

public class Activity_Puntaje extends AppCompatActivity {

    public static List<objeto> listajugadores = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__puntaje);
    }
}
