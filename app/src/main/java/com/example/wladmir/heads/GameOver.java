package com.example.wladmir.heads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameOver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
    }
    public void Reiniciar(View view)
    {
        Intent intentmain = new Intent(this, MainActivity.class);
        intentmain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentmain);
        finish();
    }
}
