package com.example.finale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class listView extends AppCompatActivity {

    ArrayList<Movie> movies = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Movie m1 = new Movie("cenderela",2014);
        Movie m2 = new Movie("mouana",2000);
        Movie m3 = new Movie("ratatowe",1599,R.drawable.img_1);

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);



    }
}