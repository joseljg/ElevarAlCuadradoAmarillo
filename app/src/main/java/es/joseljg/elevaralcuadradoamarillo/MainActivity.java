package es.joseljg.elevaralcuadradoamarillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_numero = null;
    TextView txt_resultado = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero = findViewById(R.id.edt_numero);
        txt_resultado = findViewById(R.id.txt_resultado);
    }

    public void elevar(View view) {
        double numero = Double.valueOf(edt_numero.getText().toString());
        txt_resultado.setText(String.valueOf(numero* numero ));
    }
}