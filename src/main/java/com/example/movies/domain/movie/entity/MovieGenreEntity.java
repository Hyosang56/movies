package com.example.movies.domain.movie.entity;

import com.example.movies.domain.auth.entity.GenreEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="`movie_genre_mapping`")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieGenreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "movie_idx", referencedColumnName = "idx", nullable = false)
    private MovieEntity movie;

    @ManyToOne
    @JoinColumn(name = "genre_idx", referencedColumnName = "idx", nullable = false)
    private GenreEntity genre;

}
