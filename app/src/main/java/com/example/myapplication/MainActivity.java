package com.example.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Alumno objeto1, objeto2;

    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Constructor");

        button1 = findViewById(R.id.AM1_id1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.AM1_id2);
        button2.setOnClickListener(this);

        objeto1 = new Alumno("Charly", "Otero", 20, 14030564);
        objeto2 = new Alumno("Laura", "Rodriguez", 20, 14034535);
    }

    public void dialogoAlerta(String titulo, String mensaje){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage(mensaje)
                .setTitle(titulo)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int posicion) {
                        dialog.cancel();
                    }
                });
        dialog.show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.AM1_id1:
                dialogoAlerta("Mensaje de Información", "Caracteristicas del Alumno 1: " + "\n" + objeto1.ImprimirVariables() + "\n\n" +
                        "Caracteristicas del Alumno 2: " + "\n" + objeto2.ImprimirVariables());
                break;
            case R.id.AM1_id2:
                System.exit(0);
                break;
        }
    }
}