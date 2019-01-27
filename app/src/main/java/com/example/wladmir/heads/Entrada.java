package com.example.wladmir.heads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Entrada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);

    }
    public void startApp(View view)
    {
        String user;
        Intent intent = new Intent(this, MainActivity.class);

        EditText editUser = (EditText) findViewById(R.id.textViewlog);
        user = editUser.getText().toString();

        startActivity(intent);


    }
}
