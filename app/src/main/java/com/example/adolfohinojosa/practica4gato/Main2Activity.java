package com.example.adolfohinojosa.practica4gato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        /*Bundle bt = getIntent().getExtras();
        txt1.findViewById(R.id.txtnombre);
        String rt = bt.getString("Nombre");
        txt1.setText(rt);*/
        txt1=findViewById(R.id.txtnombre);
        String s=getIntent().getStringExtra("Nombre");
        txt1.setText(s);


        /*
        txt1.findViewById(R.id.txtnombre);
        String rt = getIntent().getStringExtra("Nombre");
        //String rt = getIntent().getExtras().getString("Nombre");
        txt1.setText(rt);*/
    }
}