package com.example.movies.domain.auth.repository;

import com.example.movies.domain.auth.entity.UserGenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserGenreRepository extends JpaRepository<UserGenreEntity, Long> {

    @Query("SELECT ug.genre.idx FROM UserGenreEntity ug WHERE ug.user.idx = :userId")
    List<Long> findGenreIdsByUserId(@Param("userId") Long userId);
}
