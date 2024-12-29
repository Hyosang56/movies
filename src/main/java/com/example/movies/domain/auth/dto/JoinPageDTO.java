package com.example.movies.domain.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class JoinPageDTO {
    private List<?> genreList;

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    public static class GenreList{
        private Long idx;
        private String genreName;
    }
}
