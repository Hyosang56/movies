package com.example.movies.domain.auth.repository;

import com.example.movies.domain.auth.entity.UserGenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserGenreRepository extends JpaRepository<UserGenreEntity, Long> {
    List<UserGenreEntity> findByUserIdx(Long userIdx);
}
