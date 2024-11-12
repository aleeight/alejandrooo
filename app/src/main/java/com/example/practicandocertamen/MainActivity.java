package com.example.practicandocertamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //... variables que se utilizaron   =) //
    EditText txttitulo, txtcuerpo, txtnotaEliminar;
    Button btnAgregarNota,btnEliminarNota;
    ListView ListaNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}