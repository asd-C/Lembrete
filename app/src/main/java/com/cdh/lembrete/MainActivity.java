package com.cdh.lembrete;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * @// TODO: 16/9/28 linkar listview e itemlist
 * @// TODO: 16/9/28 criar bd para armazenar
 * @// TODO: 16/9/28 mexer layout item
 * @// TODO: 16/9/28 tela de adicionar
 * @// TODO: 16/9/28 tela de estatistica
 * */

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        ArrayList<Task> list = new ArrayList<>();
        list.add(new Task("Prova de Fisica", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Matematica", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Geo", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Hist", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Qui", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Port", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Bio", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Qui", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Fisica", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Matematica", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Geo", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Hist", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Qui", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Port", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Bio", "12/09/2016", new String[]{"Prova"}));
        list.add(new Task("Prova de Qui", "12/09/2016", new String[]{"Prova"}));

        MyAdapter myAdapter = new MyAdapter(this, -1, list);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(context, DetailOfItem.class));
            }
        });

    }
}
