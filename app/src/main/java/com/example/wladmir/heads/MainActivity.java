package com.example.wladmir.heads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
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


        ArrayList<String> Peliculas = new ArrayList<String>();
        Peliculas.add("Avengers"); Peliculas.add("Aquaman"); Peliculas.add("Jurassic Park"); Peliculas.add("Spider Man"); Peliculas.add("Thor"); Peliculas.add("Black Panther"); Peliculas.add("Halloween"); Peliculas.add("Scream"); Peliculas.add("A Quiet Place"); Peliculas.add("Bumblebee");
        Intent intent = new Intent(this, Categorias.class);

        intent.putExtra("Test", Peliculas);
        startActivity(intent);
        finish();

    }

    public void CatDeportes(View view)
    {

        ArrayList<String> Deportes = new ArrayList<String>();
        Intent intent = new Intent(this, Categorias.class);
        Deportes.add("Soccer"); Deportes.add("Tennis"); Deportes.add("Volleyball"); Deportes.add("Basketball"); Deportes.add("Boliche"); Deportes.add("Rafting"); Deportes.add("Surfing"); Deportes.add("Aerobics"); Deportes.add("Boxing"); Deportes.add("Cycling"); Deportes.add("Kung Fu");

        intent.putExtra("Test", Deportes);
        startActivity(intent);
        finish();
    }
    public void CatSeries(View view)
    {

        ArrayList<String> Series = new ArrayList<String>();
        Intent intent = new Intent(this, Categorias.class);

        Series.add("GoT"); Series.add("Strange Things"); Series.add("Black Mirror"); Series.add("Bikings"); Series.add("Outlander"); Series.add("Black Mirror"); Series.add("Breaking Bad"); Series.add("Friends"); Series.add("Doctor Who"); Series.add("Daredevil"); Series.add("Dark");

        intent.putExtra("Test", Series);
        startActivity(intent);
        finish();
    }
    public void CatActores(View view)
    {
        ArrayList<String> Actores = new ArrayList<String>();

        Actores.add("DiCaprio"); Actores.add("Morgan Freeman"); Actores.add("Robert De Niro"); Actores.add("Tom Hanks"); Actores.add("Christian Bale"); Actores.add("Will Smith"); Actores.add("Robert Downy"); Actores.add("Tom Cruise"); Actores.add("Matt Damon"); Actores.add("Johny Depp");

        Intent intent = new Intent(this, Categorias.class);

        intent.putExtra("Test", Actores);
        startActivity(intent);
        finish();

    }
    public void CatAnimales(View view)
    {

        ArrayList<String> Animales = new ArrayList<String>();

        Animales.add("Leon"); Animales.add("Zebra"); Animales.add("Girafa"); Animales.add("Mono"); Animales.add("Perro"); Animales.add("Cat"); Animales.add("Bear"); Animales.add("Cow"); Animales.add("Snake"); Animales.add("Wolf"); Animales.add("Crab"); Animales.add("Hippopotamus");

        Intent intent = new Intent(this, Categorias.class);

        intent.putExtra("Test", Animales);
        startActivity(intent);
        finish();
    }
    public void CatFrutas(View view)
    {

        ArrayList<String> Frutas = new ArrayList<String>();
        Frutas.add("Manzana"); Frutas.add("Banana"); Frutas.add("Piña"); Frutas.add("Uva"); Frutas.add("Tomate"); Frutas.add("Avocado"); Frutas.add("Cucumber"); Frutas.add("Raisins"); Frutas.add("Guava"); Frutas.add("Mango"); Frutas.add("Orange"); Frutas.add("Tamarindo"); Frutas.add("Pumpkin");

        Intent intent = new Intent(this, Categorias.class);

        intent.putExtra("Test", Frutas);
        startActivity(intent);
        finish();

    }
}
