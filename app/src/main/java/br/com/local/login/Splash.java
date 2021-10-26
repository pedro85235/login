package br.com.local.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.splash );

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                startActivity( new Intent( getApplicationContext(), MainActivity.class ) );
                finish();
            }
        }, 5000 );
    }
}