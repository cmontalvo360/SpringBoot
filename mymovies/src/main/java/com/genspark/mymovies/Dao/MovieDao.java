package com.genspark.mymovies.Dao;

import com.genspark.mymovies.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDao extends JpaRepository<Movie,Integer> {
}
