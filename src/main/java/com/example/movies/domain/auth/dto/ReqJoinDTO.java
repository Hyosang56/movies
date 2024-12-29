package com.example.movies.domain.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ReqJoinDTO {
    private User user;
    // private Genre genre;
    // pirvate UserGenre userGenre;
    private List<Long> genreIdxList;

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    public static class User {
        // private Long idx;
        private String id;
        private String nickname;
        private String password;
        private LocalDate birth;
        private String role;

    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    public static class Genre {
        private Long idx;
        //private String genreName;
    }

}
