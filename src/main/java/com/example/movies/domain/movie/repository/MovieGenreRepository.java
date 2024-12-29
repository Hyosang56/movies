package com.example.movies.domain.movie.repository;

import com.example.movies.domain.movie.entity.MovieGenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieGenreRepository extends JpaRepository<MovieGenreEntity,Long> {

    List<MovieGenreEntity> findByIdx(Long idx);
}
