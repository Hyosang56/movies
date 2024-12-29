package com.example.movies.domain.auth.repository;


import com.example.movies.domain.auth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findById(String id);

    Optional<UserEntity> findByNickname(String nickname);


}
