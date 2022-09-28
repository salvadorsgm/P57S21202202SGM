package mx.edu.tesoem.isc.p57s21202202sgm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.security.Principal;

public class Inicial extends AppCompatActivity {

    Handler manejador = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        manejador.postDelayed(aoutocambiar,5000);
    }
    Runnable aoutocambiar = new Runnable() {
        @Override
        public void run() {
            Intent intent= new Intent(Inicial.this,principalActivity.class);
            startActivity(intent);
            finish();
        }
    };
}