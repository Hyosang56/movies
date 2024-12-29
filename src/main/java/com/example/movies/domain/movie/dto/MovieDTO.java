package com.example.movies.domain.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class MovieDTO {
    private Long id;
    private String movieName;
    private String poster;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDTO movieDTO = (MovieDTO) o;
        return Objects.equals(id, movieDTO.id); // ID 기준으로 비교
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // ID 기준으로 해시코드 생성
    }
}
