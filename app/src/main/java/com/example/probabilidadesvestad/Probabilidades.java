package com.example.probabilidadesvestad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Probabilidades extends AppCompatActivity {
    Button salir, next;
    RadioButton rdOpc1, rdOpc2, rdOpc3;
    TextView txtNpregunta, txtPregunta, resp;
    int nota = 0; int Npregunta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_probabilidades);
        rdOpc1 = (RadioButton)findViewById(R.id.rbtn1);
        rdOpc2 = (RadioButton)findViewById(R.id.rbtn2);
        rdOpc3 = (RadioButton)findViewById(R.id.rbtn3);
        txtNpregunta = (TextView)findViewById(R.id.Indicep);
        txtPregunta = (TextView)findViewById(R.id.pregunta);
        resp = (TextView)findViewById(R.id.F);
        next = (Button)findViewById(R.id.SIG);
        salir = (Button)findViewById(R.id.terminar);



        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);

        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.start();

    }
    @SuppressLint("SetTextI18n")
    public void Siguiente(View v){


        if(!rdOpc1.isChecked() && !rdOpc2.isChecked() && !rdOpc3.isChecked()){

            Toast.makeText(this, "Elija una opción", Toast.LENGTH_SHORT).show();
        }

        else if(Npregunta == 1){


            if(rdOpc2.isChecked()){
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("2 de 10");
            txtPregunta.setText(R.string.Pregunta2);
            rdOpc1.setText(R.string.R21);
            rdOpc2.setText(R.string.R22);
            rdOpc3.setText(R.string.R23);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 2) {
            //Se verifica la respuesta, si es correcta se agregan 1 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("3 de 10");
            txtPregunta.setText(R.string.Pregunta3);
            rdOpc1.setText(R.string.R31);
            rdOpc2.setText(R.string.R32);
            rdOpc3.setText(R.string.R33);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 3) {

            if (rdOpc3.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }

            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("4 de 10");
            txtPregunta.setText(R.string.Pregunta4);
            rdOpc1.setText(R.string.R41);
            rdOpc2.setText(R.string.R42);
            rdOpc3.setText(R.string.R43);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 4) {

            if (rdOpc1.isChecked()) {
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("5 de 10");
            txtPregunta.setText(R.string.Pregunta5);
            rdOpc1.setText(R.string.R51);
            rdOpc2.setText(R.string.R52);
            rdOpc3.setText(R.string.R53);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 5) {
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
            txtNpregunta.setText("6 de 10");
            txtPregunta.setText(R.string.Pregunta6);
            rdOpc1.setText(R.string.R61);
            rdOpc2.setText(R.string.R62);
            rdOpc3.setText(R.string.R63);
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
            txtPregunta.setText(R.string.Pregunta7);
            rdOpc1.setText(R.string.R71);
            rdOpc2.setText(R.string.R72);
            rdOpc3.setText(R.string.R73);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        } else if(Npregunta == 7) {
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
            txtNpregunta.setText("8 de 10");
            txtPregunta.setText(R.string.Pregunta8);
            rdOpc1.setText(R.string.R81);
            rdOpc2.setText(R.string.R82);
            rdOpc3.setText(R.string.R83);
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 8) {
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
            txtNpregunta.setText("9 de 10");
            txtPregunta.setText(R.string.Pregunta9);
            rdOpc1.setText(R.string.R91);
            rdOpc2.setText(R.string.R92);
            rdOpc3.setText(R.string.R93);
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
            txtPregunta.setText(R.string.Pregunta10);
            rdOpc1.setText(R.string.R101);
            rdOpc2.setText(R.string.R102);
            rdOpc3.setText(R.string.R103);
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