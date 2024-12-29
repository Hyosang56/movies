package com.example.movies.domain.movie.repository;


import com.example.movies.domain.movie.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {

}
