package com.example.movies.domain.auth.repository;

import com.example.movies.domain.auth.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
    Optional<GenreEntity> findByIdx(Long idx);

    Optional<GenreEntity> findByGenreName(String genreName);
}
