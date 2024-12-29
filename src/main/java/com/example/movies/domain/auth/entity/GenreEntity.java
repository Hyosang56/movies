package com.example.movies.domain.auth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="`genre`")
@Getter
@NoArgsConstructor
public class GenreEntity {
    @Id
    private Long idx; // 장르의 고유 ID (자동 증가하지 않음, 고정 값)

    @Column(name = "genre_name", nullable = false)
    private String genreName; // 장르 이름
}
