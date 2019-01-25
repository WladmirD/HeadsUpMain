package com.example.wladmir.heads;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class Categorias extends AppCompatActivity {
    public int counter=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);


        Intent intentCat = getIntent();
        String message = intentCat.getStringExtra(MainActivity.EXTRA_MESSAGE);
        final Intent intentFinal = new Intent(this, GameOver.class);

        TextView textView = findViewById(R.id.textViewCategorias);
        textView.setText(message);

        final TextView textTimer = findViewById(R.id.textViewtimer);

        new CountDownTimer(11000, 1000){
            public void onTick(long millisUntilFinished){
                textTimer.setText(String.valueOf(counter));
                counter--;
            }
            public  void onFinish(){
                cancel();
                startActivity(intentFinal);
                finish();
            }
        }.start();

    }
}
