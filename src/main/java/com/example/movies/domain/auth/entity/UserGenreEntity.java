package com.example.movies.domain.auth.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_genre_mapping")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserGenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "user_idx", referencedColumnName = "idx", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "genre_idx", referencedColumnName = "idx", nullable = false)
    private GenreEntity genre;
}
