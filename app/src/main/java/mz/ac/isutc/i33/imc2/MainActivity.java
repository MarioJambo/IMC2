package mz.ac.isutc.i33.imc2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public abstract class MainActivity extends AppCompatActivity {

    private EditText editAltura;
    private EditText editPeso;
    private TextView txtresString;
    private TextView txtresultnmr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAltura = findViewById(R.id.editAltura);
        editPeso = findViewById(R.id.editPeso);
        txtresString = findViewById(R.id.txtresString);
        txtresultnmr = findViewById(R.id.txtresultnmr);
    }

    public void calcularImc(View view){

        try{

            double peso = Double.parseDouble(editPeso.getText().toString());
            double altura = Double.parseDouble(editAltura.getText().toString());
            double imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.99) {

                txtresString.setText("O peso está normal");
                txtresultnmr.setText("IMC = " + imc);
            }
            if (imc >= 25 && imc <= 29.99) {

                txtresString.setText("O peso está acima do normal");
                txtresultnmr.setText("IMC = " + imc);
            }
            if (imc >= 30 && imc <= 34.99) {

                txtresString.setText("Obesidade I");
                txtresultnmr.setText("IMC = " + imc);
            }
            if (imc >= 35 && imc <= 39.99) {

                txtresString.setText("Obesidade severa");
                txtresultnmr.setText("IMC = " + imc);
            } else if (imc > 40) {
                txtresString.setText("Obesidade mórbida");
                txtresultnmr.setText("IMC = " + imc);
            }
        }catch (Exception erro){
            System.out.println("Ocorreu um runtime error");
        }



    }




}