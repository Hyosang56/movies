package com.example.movies.domain.auth.repository;


import com.example.movies.domain.auth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByIdx(Long idx);

    Optional<UserEntity> findById(String id);

    Optional<UserEntity> findByNickname(String nickname);

    Optional<UserEntity> findByPassword(String password);

    Optional<UserEntity> findByBirth(LocalDate birth);

    Optional<UserEntity> findByRole(String role);
}
