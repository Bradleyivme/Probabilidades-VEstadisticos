package com.example.probabilidadesvestad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class CUESTIONARIOVALESTA extends AppCompatActivity {
    Button salir, next;
    RadioButton rdOpc1, rdOpc2, rdOpc3;
    TextView txtNpregunta, txtPregunta, resp;
    int nota = 0; int Npregunta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionariovalesta);
        rdOpc1 = (RadioButton)findViewById(R.id.rbtn1);
        rdOpc2 = (RadioButton)findViewById(R.id.rbtn2);
        rdOpc3 = (RadioButton)findViewById(R.id.rbtn3);
        txtNpregunta = (TextView)findViewById(R.id.Indicep);
        txtPregunta = (TextView)findViewById(R.id.pregunta);
        resp = (TextView)findViewById(R.id.F);
        next = (Button)findViewById(R.id.SIG);
        salir = (Button)findViewById(R.id.terminar);
    }
    @SuppressLint("SetTextI18n")
    public void Siguiente(View v){


        if(!rdOpc1.isChecked() && !rdOpc2.isChecked() && !rdOpc3.isChecked()){

            Toast.makeText(this, "Elija una opción", Toast.LENGTH_SHORT).show();
        }

        else if(Npregunta == 1){


            if(rdOpc1.isChecked()){
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("2 de 10");
            txtPregunta.setText(R.string.PV2);
            rdOpc1.setText(R.string.V21);
            rdOpc2.setText(R.string.V22);
            rdOpc3.setText(R.string.V23);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 2) {
            //Se verifica la respuesta, si es correcta se agregan 1 puntos a la nota
            if (rdOpc2.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("3 de 10");
            txtPregunta.setText(R.string.PV3);
            rdOpc1.setText(R.string.V31);
            rdOpc2.setText(R.string.V32);
            rdOpc3.setText(R.string.V33);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 3) {

            if (rdOpc1.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }

            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("4 de 10");
            txtPregunta.setText(R.string.PV4);
            rdOpc1.setText(R.string.V41);
            rdOpc2.setText(R.string.V42);
            rdOpc3.setText(R.string.V43);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 4) {

            if (rdOpc3.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("5 de 10");
            txtPregunta.setText(R.string.PV5);
            rdOpc1.setText(R.string.V51);
            rdOpc2.setText(R.string.V52);
            rdOpc3.setText(R.string.V53);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 5) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc2.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("6 de 10");
            txtPregunta.setText(R.string.PV6);
            rdOpc1.setText(R.string.V61);
            rdOpc2.setText(R.string.V62);
            rdOpc3.setText(R.string.V63);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 6) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc3.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("7 de 10");
            txtPregunta.setText(R.string.PV7);
            rdOpc1.setText(R.string.V71);
            rdOpc2.setText(R.string.V72);
            rdOpc3.setText(R.string.V73);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        } else if(Npregunta == 7) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("8 de 10");
            txtPregunta.setText(R.string.PV8);
            rdOpc1.setText(R.string.V81);
            rdOpc2.setText(R.string.V82);
            rdOpc3.setText(R.string.V83);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 8) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc2.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("9 de 10");
            txtPregunta.setText(R.string.PV9);
            rdOpc1.setText(R.string.V91);
            rdOpc2.setText(R.string.V92);
            rdOpc3.setText(R.string.V93);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 9) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc3.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("10 de 10");
            txtPregunta.setText(R.string.PV10);
            rdOpc1.setText(R.string.V101);
            rdOpc2.setText(R.string.V102);
            rdOpc3.setText(R.string.V103);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        } else if(Npregunta == 10) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc2.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }
            //Se setean los textos para el resultado de la nota
            txtNpregunta.setText("RESPUESTAS CORRECTAS: " +nota);
            //IF para verificar si se ha aprobado o reprobado
            if(nota >= 6){
                resp.setText("EXCELENTE");
            }else{
                resp.setText("HAY QUE REPASAR");
            }
            //Se ocultan las opciones que no se van a usar para ver la nota y resultado
            rdOpc1.setVisibility(View.GONE);
            rdOpc2.setVisibility(View.GONE);
            rdOpc3.setVisibility(View.GONE);
            txtPregunta.setVisibility(View.GONE);
            next.setVisibility(View.GONE);
        }


    }
    public void salir(View v){
        finish();

    }

}