package com.example.movies.domain.movie.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="movie")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", nullable = false, unique = true)
    private Long idx;

    @Column(name = "movie_name" ,nullable = false)
    private String movieName;

    @Column(name = "poster" ,nullable = false)
    private String poster;

    @Column(name = "movie_date" ,nullable = false)
    private String movieDate;

    @Column(name = "country" ,nullable = false)
    private String country;

    @Column(name = "grade" )
    private String grade;

    @Column(name = "movie_time")
    private Integer movieTime;

    @Column(name = "summary" ,nullable = false)
    private String summary;

    @Column(name = "movie_url")
    private String movieUrl;
}
