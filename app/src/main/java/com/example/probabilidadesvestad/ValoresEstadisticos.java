package com.example.probabilidadesvestad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class ValoresEstadisticos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valores_estadisticos);

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