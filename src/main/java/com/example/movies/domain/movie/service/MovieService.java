package com.example.movies.domain.movie.service;

import com.example.movies.domain.movie.MovieNotFoundException;
import com.example.movies.domain.movie.dto.ResMoviePageDTO;
import com.example.movies.domain.movie.dto.ResMoviePageDTO.Movie;
import com.example.movies.domain.movie.entity.MovieEntity;
import com.example.movies.domain.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // 영화 정보 가져와서 ResMoviePageDTO 생성해서 반환.
    public ResMoviePageDTO getResMoviePageDTO() {

        // 모든 영화 정보 조회
        List<MovieEntity> movieEntityList = movieRepository.findAll();

        // ResMoviePageDTO 객체를 빌더 패턴 사용해서 생성
        // movieEntityList 이용해서 영화 엔티티 Movie 객체로 변환.
        // movieList 에 담아서 ResMoviePageDTO 객체 생성
        return ResMoviePageDTO.builder()
                .movieList(
                        movieEntityList.stream()
                                .map(movieEntity -> Movie.fromEntity(movieEntity))
                                .toList())
                .build();
    }

    // 특정 영화의 상세 정보 가져오기
    public ResMoviePageDTO.Movie getMovieDetails(Long movieIdx) {
        Optional<MovieEntity> optionalmovieEntity = movieRepository.findById(movieIdx);

        if (optionalmovieEntity.isPresent()) {
            MovieEntity movieEntity = optionalmovieEntity.get();
            return ResMoviePageDTO.Movie.builder()
                    .movieName(movieEntity.getMovieName())
                    .country(movieEntity.getCountry())
                    .movieDate(movieEntity.getMovieDate())
                    .grade(movieEntity.getGrade())
                    .summary(movieEntity.getSummary())
                    .poster(movieEntity.getPoster())
                    .build();
        } else {
            // 영화가 존재하지 않을 경우 예외를 던집니다.
            throw new MovieNotFoundException("Movie with id " + movieIdx + " not found");
        }
    }
}
