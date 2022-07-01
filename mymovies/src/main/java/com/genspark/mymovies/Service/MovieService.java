package com.genspark.mymovies.Service;

import com.genspark.mymovies.Entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    Movie getMovieById(int movId);
    Movie addMovie(Movie movie);
    Movie updateMovie(Movie movie);
    String deleteMovie(int movId);
}
