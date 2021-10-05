package com.example.calculadora2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText parcela1, parcela2, resultado;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parcela1 = (EditText) findViewById(R.id.parcela1);
        parcela2 = (EditText) findViewById(R.id.parcela2);
        resultado = (EditText) findViewById(R.id.resultado);
        botao = (Button) findViewById(R.id.botao);
    }
    public void somar(View v) {
        double soma = Double.parseDouble(parcela1.getText().toString()) + Double.parseDouble(parcela2.getText().toString());
        resultado.setText(soma+"");
    }
}