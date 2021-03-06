package com.example.probabilidadesvestad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;

public class ValoresEstadisticos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valores_estadisticos);

        setContentView(R.layout.activity_valores_estadisticos);

        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);

        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.start();

        FragmentManager fragmentManager = getSupportFragmentManager();
        Button btnMedVar = findViewById(R.id.btnMedVar);
        Button btnDistNor = findViewById(R.id.btnDistNor);

        btnMedVar.setOnClickListener(view -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, MedVarFragment.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        });

        btnDistNor.setOnClickListener(view -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, DistNormalFragment.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();

        });

    }

}