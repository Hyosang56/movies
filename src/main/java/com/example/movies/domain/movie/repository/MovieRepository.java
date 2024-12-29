package com.example.movies.domain.movie.repository;


import com.example.movies.domain.movie.dto.MovieDTO;
import com.example.movies.domain.movie.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
    @Query("SELECT new com.example.movies.domain.movie.dto.MovieDTO(m.idx, m.movieName, m.poster) " +
            "FROM MovieGenreEntity mg " +
            "JOIN mg.movie m " +
            "WHERE mg.genre.idx IN :genreIds")
    List<MovieDTO> findMoviesByGenreIds(@Param("genreIds") List<Long> genreIds);
}
