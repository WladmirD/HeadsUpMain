package com.example.wladmir.heads;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

public class Categorias extends AppCompatActivity {
    public int counter=10;
    private SensorManager sensorManager;
    private Sensor gyroscopeSensor;
    private SensorEventListener gyroscopeEventListener;

    public static final String EXTRA_MESSAGE2 = "com.example.wladmir.heads.MESSAGE";
    public int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);


        Intent intentCat = getIntent();
        final String message = intentCat.getStringExtra(MainActivity.EXTRA_MESSAGE);



        final TextView textView = findViewById(R.id.textViewCategorias);
        textView.setText(message);
        final Intent intentFinal = new Intent(Categorias.this, GameOver.class);




        final TextView textTimer = findViewById(R.id.textViewtimer);

        new CountDownTimer(11000, 1000){

            public void onTick(long millisUntilFinished){
                textTimer.setText(String.valueOf(counter));
                counter--;
            }
            public  void onFinish(){

                String scor = Integer.toString(score);

                intentFinal.putExtra(EXTRA_MESSAGE2, scor);

                cancel();
                startActivity(intentFinal);

                finish();

            }
        }.start();
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        gyroscopeSensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        if (gyroscopeSensor == null)
        {
            Toast.makeText(this, "No gyro", Toast.LENGTH_SHORT).show();
            finish();
        }

        gyroscopeEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[1] > 5.3f)
                {
                    textView.setText(message);
                    getWindow().getDecorView().setBackgroundColor(Color.BLUE);


                }else if (sensorEvent.values[1] < -5.3f)
                {
                    textView.setText(message);
                    getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    score = score+100;
                }else if (sensorEvent.values[1] == 0)
                {
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };

    }
    @Override
    protected  void onResume()
    {
        super.onResume();
        sensorManager.registerListener(gyroscopeEventListener, gyroscopeSensor, SensorManager.SENSOR_DELAY_FASTEST);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(gyroscopeEventListener);
    }
}
/*
    private SensorManager sensorManager;
    private Sensor gyroscopeSensor;
    private SensorEventListener gyroscopeEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        gyroscopeSensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        if (gyroscopeSensor == null)
        {
            Toast.makeText(this, "No gyro", Toast.LENGTH_SHORT).show();
            finish();
        }

        gyroscopeEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[2] > 0.5f)
                {
                    getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                }else if (sensorEvent.values[2] < -0.5f)
                {
                    getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
    }
    @Override
    protected  void onResume()
    {
        super.onResume();
        sensorManager.registerListener(gyroscopeEventListener, gyroscopeSensor, SensorManager.SENSOR_DELAY_FASTEST);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(gyroscopeEventListener);
    }
 */
