package com.example.ameza.mimapaxd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapaUni(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("longitud",-77.04814658907094);
        i.putExtra("latitud",-12.024024843593784);
        i.putExtra("lugar","Universidad Nacional de Ingeniería");
        startActivity(i);
    }

    public void irMapaMetroUni(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("longitud",-77.05191241052785);
        i.putExtra("latitud",-12.012156491064326);
        i.putExtra("lugar","Hipermercado Metro");
        startActivity(i);
    }

    public void irMapaPlazaNorte(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("longitud",-77.05882446315923);
        i.putExtra("latitud",-12.006857013497871);
        i.putExtra("lugar","Centro Comercial Plaza Norte");
        startActivity(i);
    }

    public void irMapaFevacel(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("longitud",-77.05504254844823);
        i.putExtra("latitud",-12.007245295592075);
        i.putExtra("lugar","Mercado Central Fevacel");
        startActivity(i);
    }

}
