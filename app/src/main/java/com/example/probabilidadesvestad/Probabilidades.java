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
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 2");
            txtPregunta.setText("Se lanzan al aire tres monedas iguales. Calcula la probabilidad de que salgan dos caras y una cruz");
            rdOpc1.setText("3/8");
            rdOpc2.setText("2/4");
            rdOpc3.setText("3/5");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 2) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 3");
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
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 4");
            txtPregunta.setText("Esta es la pregunta 4, su respuesta correcta es la opcion 1");
            rdOpc1.setText("Opcion 1 p4");
            rdOpc2.setText("Opcion 2 p4");
            rdOpc3.setText("Opcion 3 p4");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 4) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 5");
            txtPregunta.setText("Esta es la pregunta 5, su respuesta correcta es la opcion 2");
            rdOpc1.setText("Opcion 1 p5");
            rdOpc2.setText("Opcion 2 p5");
            rdOpc3.setText("Opcion 3 p5");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 5) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc2.isChecked()) {
                nota = nota + 2;
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