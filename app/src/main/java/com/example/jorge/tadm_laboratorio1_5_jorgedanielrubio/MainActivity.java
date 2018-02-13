package com.example.jorge.tadm_laboratorio1_5_jorgedanielrubio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView estados = (ListView)findViewById(R.id.lista);
        String[] values = new String[]{"pauses:puede estar visible pero sin el foco",
                "Resumed:Una actividad esta visble y activa",
                "Stopped:No visible",
                "Inactive:Eliminado de la pila de tareas"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values );
        estados.setAdapter(adapter);


    }
}
