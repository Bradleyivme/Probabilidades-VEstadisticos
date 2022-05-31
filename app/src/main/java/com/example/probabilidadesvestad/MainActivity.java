package com.example.probabilidadesvestad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);

        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.start();

    }

    public void Iraprobabilidades(View view){
        Intent x = new Intent(this,Probabilidades.class);
        startActivity(x);
    }
    public void Iravaloresestadisticos(View view){
        Intent x = new Intent(this,ValoresEstadisticos.class);
        startActivity(x);
    }
    public void cuestioanariovalestadisticos(View view){
        Intent x = new Intent(this,CUESTIONARIOVALESTA.class);
        startActivity(x);
    }
    public void contenidos(View view){
        Intent x = new Intent(this,Aprendizaje.class);
        startActivity(x);
    }



}