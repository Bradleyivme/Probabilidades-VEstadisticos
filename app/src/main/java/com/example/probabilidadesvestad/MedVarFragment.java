package com.example.probabilidadesvestad;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class MedVarFragment extends Fragment {

    View vista;
    Button btnRegresarDef;
    Button btnGuardarX;
    EditText editTxtValorx;
    EditText edTxtValorFx;
    TextView txtVSizes;
    Button btnCalcularMv;
    TextView txtViewMedia;
    TextView txtViewVarianza;
    private String strValorX;
    private String strValorFx;
    private double valorX;
    private double valorFx;
    private List<Double> listaValorX;
    private List<Double> listValorFx;
    private double media;
    private String strMedia;
    private double varianza;
    private String strVarianza;


    public MedVarFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_med_var, container, false);
        btnRegresarDef = vista.findViewById(R.id.btnRegresarMv);
        btnGuardarX = vista.findViewById(R.id.btnGuardarMv);
        btnCalcularMv = vista.findViewById(R.id.btnCalcularMv);
        editTxtValorx = vista.findViewById(R.id.editTxtValorX);
        edTxtValorFx = vista.findViewById(R.id.editTxtValorFx);
        txtVSizes = vista.findViewById(R.id.txtViewSizes);
        txtViewMedia = vista.findViewById(R.id.txtViewMedia);
        txtViewVarianza = vista.findViewById(R.id.txtViewVarianza);
        listaValorX = new ArrayList<>();
        listValorFx = new ArrayList<>();

        btnRegresarDef.setOnClickListener(view -> {
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, DefaultxFragment.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        });

        btnGuardarX.setOnClickListener(view -> {
            strValorX = editTxtValorx.getText().toString();
            valorX = Double.parseDouble(strValorX);

            listaValorX.add(valorX);

            strValorFx = edTxtValorFx.getText().toString();
            valorFx = Double.parseDouble(strValorFx);

            listValorFx.add(valorFx);

            txtVSizes.setText("x =" + listaValorX + " f(x) = " + listValorFx);

            edTxtValorFx.setText("");
            editTxtValorx.setText("");
        });

        btnCalcularMv.setOnClickListener(view -> {

            for (int i = 0; i < listaValorX.size(); i++){

                double valorMedia1 = listaValorX.get(i);
                double valorMedia2 = listValorFx.get(i);

                media = (valorMedia1 * valorMedia2) + media;
            }

            strMedia = String.valueOf(media);

            txtViewMedia.setText("La media es : " + strMedia);

            for (int j = 0; j < listValorFx.size(); j++){

                double valorDesvEst1 = listaValorX.get(j);
                double valorDesvEst2 = listValorFx.get(j);

                varianza = ((valorDesvEst1 - media)*(valorDesvEst1 - media) * valorDesvEst2) + varianza;
            }

            strVarianza = String.valueOf(varianza);

            txtViewVarianza.setText("La Varianza es: " + strVarianza);

            listaValorX.clear();
            listValorFx.clear();
            media = 0;
            varianza = 0;
        });



        return vista;
    }
}