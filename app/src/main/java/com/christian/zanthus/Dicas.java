package com.christian.zanthus;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class Dicas extends AppCompatActivity {
    public static String NOME_BANCO = "Zanthus2017";
    public static String NOME_TABELA = "bancoZanthus";
    public static String CODIGO = "codigo";
    public static String DESCRICAO = "descricao";
    protected SQLiteDatabase bancoDados = null;
    ListView MostraDados;
    SimpleCursorAdapter adapterLista;
    Cursor cursor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_dicas);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

    }


}
