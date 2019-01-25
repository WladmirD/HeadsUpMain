package com.example.wladmir.heads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "com.example.wladmir.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Random rand = new Random();
    public void CatPeliculas(View view)
    {

        List<String> Peliculas = Arrays.asList("Avengers", "Aquaman", "Jurassic Park", "Spider Man", "Thor");
        Intent intent = new Intent(this, Categorias.class);

        int randomInd = rand.nextInt(Peliculas.size());
        String randomWord = Peliculas.get(randomInd);
        String message = randomWord;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        finish();

    }

    public void CatDeportes(View view)
    {
        List<String> Deportes = Arrays.asList("Soccer", "Tennis", "Volleyball", "Basketball", "Boliche");
        Intent intent = new Intent(this, Categorias.class);

        //random number for random word
        int randomInd = rand.nextInt(Deportes.size());
        String randomWord = Deportes.get(randomInd);
        String message = randomWord;
        //send  random word to Activity
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        finish();
    }
    public void CatSeries(View view)
    {
        List<String> Series = Arrays.asList("GoT", "Stranger Things", "Black Mirror", "Vikings", "Outlander");
        Intent intent = new Intent(this, Categorias.class);

        int randomInd = rand.nextInt(Series.size());
        String randomWord = Series.get(randomInd);
        String message = randomWord;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        finish();
    }
    public void CatActores(View view)
    {
        List<String> Actores = Arrays.asList("DiCaprio", "Morgan Freeman", "Robert De Niro", "Tom Hanks", "Christian Bale");
        Intent intent = new Intent(this, Categorias.class);

        int randomInd = rand.nextInt(Actores.size());
        String randomWord = Actores.get(randomInd);
        String message = randomWord;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        finish();

    }
    public void CatAnimales(View view)
    {
        List<String> Animales = Arrays.asList("Leon", "Zebra", "Girafa", "Mono", "Perro");
        Intent intent = new Intent(this, Categorias.class);

        int randomInd = rand.nextInt(Animales.size());
        String randomWord = Animales.get(randomInd);
        String message = randomWord;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        finish();
    }
    public void CatFrutas(View view)
    {
        List<String> Frutas = Arrays.asList("Manzana", "Banana", "Piña", "Uva", "Tomate");
        Intent intent = new Intent(this, Categorias.class);

        int randomInd = rand.nextInt(Frutas.size());
        String randomWord = Frutas.get(randomInd);
        String message = randomWord;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        finish();

    }
}
