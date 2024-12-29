package com.example.movies.domain.movie.controller;

import com.example.movies.domain.movie.MovieNotFoundException;
import com.example.movies.domain.movie.dto.ResMoviePageDTO;
import com.example.movies.domain.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/main/movie")
    public ModelAndView Movie(){
        ModelAndView modelAndView = new ModelAndView();

        // movieService 사용하여 영화 정보 가져옴.
        ResMoviePageDTO moviePageDTO = movieService.getResMoviePageDTO();

        // 가져온 영화 정보를 dto 라는 이름으로 뷰에 전달.
        modelAndView.addObject("dto", moviePageDTO);


        modelAndView.setViewName("movie/moviePage");
        return modelAndView;
    }
    //영화 상세페이지
    @GetMapping("/main/movie-details/{movieIdx}")
    public ModelAndView MovieDetails(@PathVariable Long movieIdx){
        ModelAndView modelAndView = new ModelAndView();

//        //movieService 사용하여 영화 정보 가져오기
//        ResMoviePageDTO.Movie movieDetailsDTO= movieService.getMovieDetails(movieIdx);
//        modelAndView.addObject("dto", movieDetailsDTO);
//
//        modelAndView.setViewName("movie/movieDetailsPage");
//        return modelAndView;
        try {
            // movieService 사용하여 영화 정보 가져오기
            ResMoviePageDTO.Movie movieDetailsDTO = movieService.getMovieDetails(movieIdx);
            modelAndView.addObject("dto", movieDetailsDTO);
            modelAndView.setViewName("movie/movieDetailsPage");
        } catch (MovieNotFoundException ex) {
            // 영화가 존재하지 않을 경우 오류 페이지로 이동
            modelAndView.addObject("message", ex.getMessage());
            modelAndView.setViewName("error/movieNotFound");
        }

        return modelAndView;
    }

}
