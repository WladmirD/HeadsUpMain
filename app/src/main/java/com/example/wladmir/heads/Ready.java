package com.example.wladmir.heads;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ready extends AppCompatActivity {
    public int counter = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready);
        /*final Intent catint = new Intent(this, Categorias.class);

        final TextView texttemp = findViewById(R.id.textViewtemp);
        new CountDownTimer(11000, 1000){
            public void onTick(long millisUntilFinished){
                texttemp.setText(String.valueOf(counter));
                counter--;
            }
            public  void onFinish(){
                startActivity(catint);
            }
        }.start();
    */}
}
