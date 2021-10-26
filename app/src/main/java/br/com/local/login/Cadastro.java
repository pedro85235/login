package br.com.local.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Cadastro extends AppCompatActivity {

    Button Cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        Cadastrar = findViewById(R.id.Cadastrar);

        Cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Cadastro Realizado com Sucesso", Toast.LENGTH_SHORT).show();
                Intent Cadastrar = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Cadastrar);
            }
        });
    }
}