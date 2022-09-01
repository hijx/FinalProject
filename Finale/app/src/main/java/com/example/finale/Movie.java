package com.example.finale;

public class Movie {

    private String movieName;
    private int publicationYear;
private int novieImage;

    public Movie(String movieName, int publicationYear) {

        this.movieName = movieName;
        this.publicationYear = publicationYear;
this.novieImage=novieImage;

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getMovieImage() {
        return novieImage;
    }

    public void setMovieImage(int movieImage) {
        this.novieImage = movieImage;
    }
}



