package com.genspark.mymovies.Controller;

import com.genspark.mymovies.Entity.Movie;
import com.genspark.mymovies.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String home() {
        return "<HTML><H1>My Movie Favorites List!</H1></HTML>";
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return this.movieService.getAllMovies();
    }

    @GetMapping("/movies/{movId}")
    public Movie getMovie(@PathVariable String movId) {
        return this.movieService.getMovieById(Integer.parseInt(movId));
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return this.movieService.addMovie(movie);
    }

    @PutMapping("/movies")
    public Movie updateMovie(@RequestBody Movie movie) {
        return this.movieService.updateMovie(movie);
    }

    @DeleteMapping("/movies/{movId}")
    public String deleteTask(@PathVariable String movId) {
        return this.movieService.deleteMovie(Integer.parseInt(movId));
    }
}
