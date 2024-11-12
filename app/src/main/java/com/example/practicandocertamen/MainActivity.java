package com.example.practicandocertamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //... variables que se utilizaron   =) //
    EditText txttitulo,txtCuerpo,txtNotaEliminar;
    Button btnAgregarNota,btnEliminarNota;
    ListView ListaNotas;

    // aqui va un arreglo que va a almacenar todas las notas que se vallan almacenando //
    ArrayList<Nota> notas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //aqui tengo el codigo de todas los elementso de la interfaz//

        txttitulo = findViewById(R.id.txtTitulo);
        txtCuerpo = findViewById(R.id.txtCuerpo);
        txtNotaEliminar = findViewById(R.id.txtNotaEliminar);
        btnAgregarNota = findViewById(R.id.btnAgregarNota);
        btnEliminarNota = findViewById(R.id.btnEliminarNota);
        ListaNotas = findViewById(R.id.listnota);


    }
}