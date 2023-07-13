package com.centec.gasolinaeetanol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float gasolina;
    float etanol;
    float calcular;

    EditText edGasolina, edEtanol;

    TextView tvResultado;

    Button btVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edGasolina = (EditText) findViewById(R.id.edGasolina);
        edEtanol = (EditText) findViewById(R.id.edEtanol);
        btVerificar = (Button) findViewById(R.id.btVerificar);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        btVerificar.setOnClickListener(new View.OnClickListener(){
             @Override
            public void onClick(View btVerificar) {
                gasolina = Float.parseFloat(edGasolina.getText().toString());
                etanol = Float.parseFloat(edEtanol.getText().toString());

                calcular = etanol/ gasolina;
                if (calcular <= 0.7){
                    tvResultado.setText("Melhor opção Etanol");
                }else {
                    tvResultado.setText("Melhor opção Gasolina");
                }


            }
        });

    }
}
