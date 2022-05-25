package com.example.probabilidadesvestad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Probabilidades extends AppCompatActivity {
    Button salir, next;
    RadioButton rdOpc1, rdOpc2, rdOpc3;
    TextView txtNpregunta, txtPregunta;
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
        next = (Button)findViewById(R.id.SIG);
        salir = (Button)findViewById(R.id.terminar);

    }
    @SuppressLint("SetTextI18n")
    public void Siguiente(View v){


        if(!rdOpc1.isChecked() && !rdOpc2.isChecked() && !rdOpc3.isChecked()){

            Toast.makeText(this, "Elija una opción", Toast.LENGTH_SHORT).show();


        }

        else if(Npregunta == 1){


            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if(rdOpc2.isChecked()){
                nota = nota + 1;
                Toast.makeText(this,  R.string.correct, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT).show();
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
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
            txtNpregunta.setText("3 de 10");
            txtPregunta.setText("De los 39 alumnos de una clase, 16 escogieron francés y 27 inglés. " +
                    "Nueve alumnos eligieron ambos, y el resto no escogió ninguno de ellos. " +
                    "Si se elige al azar un alumno de dicha clase, ¿Cuál es la probabilidad de que elija ambos idiomas?.");
            rdOpc1.setText("4/39");
            rdOpc2.setText("35/39");
            rdOpc3.setText("9/39");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 3) {
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
            txtNpregunta.setText("4 de 10");
            txtPregunta.setText("Se escuchan tres discos y se vuelven a guardar, al azar. ¿Cuál es la " +
                    "probabilidad de que al menos uno de los discos haya sido guardado en el envoltorio que le correspondía?");
            rdOpc1.setText("2/3");
            rdOpc2.setText("6/7");
            rdOpc3.setText("1/3");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 4) {
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
            txtNpregunta.setText("5 de 10");
            txtPregunta.setText("Se tienen cinco pares de guantes de distinto color. Entremezclamos bien los dos guantes. " +
                    "Extraemos dos de ellos al azar. ¿Cuál es la probabilidad de que ambos formen pareja?");
            rdOpc1.setText("1/9");
            rdOpc2.setText("2/3");
            rdOpc3.setText("5/9");
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
            txtPregunta.setText("Al lanzar dos dados ¿Cuál es la probabilidad de que el resultado de los dos dados no sea 7?");
            rdOpc1.setText("1/6");
            rdOpc2.setText("2/7");
            rdOpc3.setText("5/6");
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
            txtPregunta.setText("Determinar la probabilidad de que al extraer 2 cartas de una baraja, estas sean corazones");
            rdOpc1.setText("1/13");
            rdOpc2.setText("1/17");
            rdOpc3.setText("4/27");
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
            txtPregunta.setText("Un artillero dispara a un blanco. Si la probabilidad de acertar un tiro es de 0.01 ¿Qué probabilidad tiene de no acertar?");
            rdOpc1.setText("0.99");
            rdOpc2.setText("0.09");
            rdOpc3.setText("0.9");
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
            txtPregunta.setText("En una caja hay 10 focos de los cuales 4 estan en buen estado, una persona toma la azar 3 focos" +
                    "Hallar la probabilidad de que por lo menos uno este en buen estado");
            rdOpc1.setText("1/5");
            rdOpc2.setText("1/6");
            rdOpc3.setText("5/6");
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
            txtPregunta.setText("Sabiendo que la probabilidad de que ocurra un accidente en un 1Km de una carretera es de 1/3" +
                    "¿Cuál es la probabilidad de que ocurra encontrar al menos un accidente en 3Km de esa carretera?");
            rdOpc1.setText("1/27");
            rdOpc2.setText("19/27");
            rdOpc3.setText("2/3");
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
            txtNpregunta.setText("RESPUESTAS CORRECTAS: "+nota);
            //IF para verificar si se ha aprobado o reprobado
            if(nota >= 6){
                txtPregunta.setText("EXCELENTE");
            }else{
                txtPregunta.setText("HAY QUE REPASAR");
            }
            //Se ocultan las opciones que no se van a usar para ver la nota y resultado
            rdOpc1.setVisibility(View.GONE);
            rdOpc2.setVisibility(View.GONE);
            rdOpc3.setVisibility(View.GONE);
            next.setVisibility(View.GONE);
        }


    }
    public void salir(View v){
        finish();

    }
}