package com.genspark.mymovies.Service;

import com.genspark.mymovies.Dao.MovieDao;
import com.genspark.mymovies.Entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieDao movieDao;

    @Override
    public List<Movie> getAllMovies() {
        return this.movieDao.findAll();
    }

    @Override
    public Movie getMovieById(int movId) {
        Optional<Movie> list = this.movieDao.findById(movId);
        Movie movie = null;
        if(list.isPresent()) {
            movie = list.get();
        } else {
            throw new RuntimeException("Task not found for id: " + movId);
        }

        return movie;
    }

    @Override
    public Movie addMovie(Movie movie) {
        return this.movieDao.save(movie);
    }

    @Override
    public Movie updateMovie(Movie movie) {
        return this.movieDao.save(movie);
    }

    @Override
    public String deleteMovie(int movId) {
        this.movieDao.deleteById(movId);
        return "Movie deleted!";
    }
}
