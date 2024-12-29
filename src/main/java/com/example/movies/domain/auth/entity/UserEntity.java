package com.example.movies.domain.auth.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 id 자동 생성
    private Long idx;
    private String id;
    private String nickname;
    private String password;
    private LocalDate birth;
    private String role;

    //Builder 패턴 활성화
    @Builder
    public UserEntity(String id, String nickname, String password, LocalDate birth, String role) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.birth = birth;
        this.role = role;

    }
}
