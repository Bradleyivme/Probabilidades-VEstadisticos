package com.example.probabilidadesvestad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Iraprobabilidades(View view){
        Intent x = new Intent(this,Probabilidades.class);
        startActivity(x);
    }
    public void Iravaloresestadisticos(View view){
        Intent x = new Intent(this,ValoresEstadisticos.class);
        startActivity(x);
    }

}