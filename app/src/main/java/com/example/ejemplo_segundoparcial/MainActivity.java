package com.example.ejemplo_segundoparcial;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.ejemplo_segundoparcial.Activity_Puntaje.listajugadores;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnJugar, btnPuntaje, btnConfiguracion;
    private int Dificultad = 0;
    private String Nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //orientacion solo vertical
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    //asignar el id  los controles
        btnJugar = findViewById(R.id.btnJugar);
        btnPuntaje = findViewById(R.id.btnPuntaje);
        btnConfiguracion = findViewById(R.id.btnConfiguracion);

        btnJugar.setOnClickListener(this);
        btnPuntaje.setOnClickListener(this);
        btnConfiguracion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnJugar:

                //verificar que haya datos en configuracion
                if(listajugadores==null) {
                    Toast.makeText(this,"Guarde Jugador en CONFIGURACION",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    // abrimos la activity juegos
                    Intent config = new Intent(this,Activity_Jugar.class);
                    startActivity(config);
                }

                break;

            case R.id.btnPuntaje:
                Intent puntaje = new Intent(this, Activity_Puntaje.class);
                startActivity(puntaje);
                break;

            case R.id.btnConfiguracion:
                Intent config = new Intent(this,Activity_Configuracion.class);
                config.putExtra("Nombre",this.Nombre);
                config.putExtra("Dificultad", this.Dificultad);
                startActivityForResult(config,1);
                break;

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1){
            if (requestCode == RESULT_OK){
                Nombre = data.getStringExtra("Nombre");
                Dificultad = data.getIntExtra("Dificultad",0);
                Toast.makeText(this,"Configuración guardada",Toast.LENGTH_LONG).show();
            }
        }
    }
}
