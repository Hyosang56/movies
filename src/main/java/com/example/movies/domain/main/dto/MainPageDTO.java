package com.example.movies.domain.main.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class MainPageDTO {
    private List<MovieRank> movieRankAndTitleList;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder
    public static class MovieRank{
        private int rank;
        private String movieName;
        private String posterPath;
    }
}
