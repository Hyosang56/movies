package com.example.movies.domain.auth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="`genre`")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idx", callSuper = false) // equals 로 객체 비교할때 idx로만 비교한다는 뜻.
public class GenreEntity {
    @Id

    @Column(name = "idx",nullable = false, unique = true)
    private Long idx;

    @Column(name = "genre_name", nullable = false, unique = true)
    private String genreName;
}
