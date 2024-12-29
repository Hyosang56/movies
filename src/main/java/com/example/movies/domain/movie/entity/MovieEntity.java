package com.example.movies.domain.movie.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "movie")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx; // 영화의 고유 ID

    @Column(name = "movie_name", nullable = false)
    private String movieName; // 영화 제목

    @Column(name = "poster", nullable = true)
    private String poster; // 포스터 경로

    @Column(name = "movie_date")
    private String movieDate; // 개봉 날짜

    @Column(name = "country")
    private String country; // 제작 국가

    @Column(name = "summary")
    private String summary; // 영화 요약
}

