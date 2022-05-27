package com.example.probabilidadesvestad;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class DistNormalFragment extends Fragment {

    View vista;
    Button btnRegreso2;
    Button btnCalcularDistNor;
    private RadioButton rBSingular;
    private RadioButton rBEntre;
    private EditText inMedia;
    private TextView mostRestul;
    private String datosInMedia;
    private double media;
    private EditText inDesvEstn;
    private String datosInDesvEst;
    private double desvEst;
    private EditText inValorX1;
    private String datosInValorX1;
    private double valorX1;
    private EditText inValorX2;
    private String datosInValorX2;
    private double valorX2;
    private double resultado;
    private double resultado2;
    private String strResultado;
    private String strResultado2;

    public DistNormalFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_dist_normal, container, false);

        inMedia = vista.findViewById(R.id.editTxtMedia);
        mostRestul = vista.findViewById(R.id.txtViewRst);
        btnCalcularDistNor = vista.findViewById(R.id.btnCalcularDN);
        inDesvEstn = vista.findViewById(R.id.editTxtDesvEstn);
        inValorX1 = vista.findViewById(R.id.editTxtValorX1);
        inValorX2 = vista.findViewById(R.id.editTxtValorX2);
        rBSingular = vista.findViewById(R.id.radBtnSing);
        rBEntre = vista.findViewById(R.id.radBtnEnt);

        btnRegreso2 = vista.findViewById(R.id.btnRegresar2);
        btnRegreso2.setOnClickListener(view -> {
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, DefaultxFragment.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        });

        btnCalcularDistNor.setOnClickListener(view -> {

            media = 0;
            desvEst = 0;
            valorX1 = 0;
            valorX2 = 0;

            if(rBSingular.isChecked()) {
                datosInMedia = inMedia.getText().toString();
                media = Double.parseDouble(datosInMedia);

                datosInDesvEst = inDesvEstn.getText().toString();
                desvEst = Double.parseDouble(datosInDesvEst);

                datosInValorX1 = inValorX1.getText().toString();
                valorX1 = Double.parseDouble(datosInValorX1);

                resultado = (valorX1 - media) / desvEst;

                strResultado = String.valueOf(resultado);

                mostRestul.setText("X1 = " + strResultado);

            }else if(rBEntre.isChecked()){
                datosInMedia = inMedia.getText().toString();
                media = Double.parseDouble(datosInMedia);

                datosInDesvEst = inDesvEstn.getText().toString();
                desvEst = Double.parseDouble(datosInDesvEst);

                datosInValorX1 = inValorX1.getText().toString();
                valorX1 = Double.parseDouble(datosInValorX1);

                datosInValorX2 = inValorX2.getText().toString();
                valorX2 = Double.parseDouble(datosInValorX2);

                resultado = (valorX1 - media) / desvEst;

                resultado2 = (valorX2 - media) / desvEst;

                strResultado = String.valueOf(resultado);
                strResultado2 = String.valueOf(resultado2);

                mostRestul.setText("X1 = " + strResultado + "     X2 = " + strResultado2);
            }else{

                mostRestul.setText("Se necesita tomar una decision");
            }

        });

        return vista;
    }
}