package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.santalu.maskedittext.MaskEditText;

public class MainActivity extends AppCompatActivity {

    private MaskEditText edCpf;
    private MaskEditText edNascimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edCpf = findViewById(R.id.editCpf);
        edNascimento = findViewById(R.id.editNasc);

        String editC = edCpf.getText().toString();
        String editN = edNascimento.getText().toString();

    }

    public void CalcularAuxilio(View v) {

        double cpf = Double.parseDouble(edCpf.getText().toString());
        double nascimento = Double.parseDouble(edNascimento.getText().toString());

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle parametros = new Bundle();

        intent.putExtras(parametros);
        startActivity(intent);

    }

    public void LimparCampos(View v) {

        edCpf.setText("");
        edNascimento.setText("");

    }
}