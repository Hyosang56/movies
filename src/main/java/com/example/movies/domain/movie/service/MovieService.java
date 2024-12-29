package com.example.movies.domain.movie.service;

import com.example.movies.domain.auth.repository.UserGenreRepository;
import com.example.movies.domain.movie.dto.MovieDTO;
import com.example.movies.domain.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final UserGenreRepository userGenreRepository;
    private final MovieRepository movieRepository;

    public List<MovieDTO> getRecommendedMovies(Long userId) {
        // 사용자의 선호 장르를 가져오기
        List<Long> genreIds = userGenreRepository.findGenreIdsByUserId(userId);

        // 선호 장르에 해당하는 영화 리스트 반환
        List<MovieDTO> allMovies = movieRepository.findMoviesByGenreIds(genreIds);

        // 중복 영화 제거 (영화 ID 기준으로 필터링)
        return allMovies.stream()
                .distinct() // 중복 제거
                .collect(Collectors.toList());
    }
}
