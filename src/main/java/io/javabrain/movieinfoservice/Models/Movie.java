package io.javabrain.movieinfoservice.Models;

public class Movie {

    private String name;
    private String movieId;
   

    public Movie(String name, String id) {
        this.name = name;
        this.movieId = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
