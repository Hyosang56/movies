package com.example.movies.domain.movie.controller;

import com.example.movies.domain.movie.dto.MovieDTO;
import com.example.movies.domain.movie.service.MovieService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @GetMapping("/movies")
    public String getRecommendedMovies(HttpSession session, Model model) {
        Long userId = (Long) session.getAttribute("idx");
        if (userId == null) {
            return "redirect:/auth/login"; // 로그인이 안 된 경우 로그인 페이지로 리다이렉트
        }

        List<MovieDTO> recommendedMovies = movieService.getRecommendedMovies(userId);
        model.addAttribute("dto", recommendedMovies);

        return "movie/moviesPage"; // moviesPage.html 반환
    }

}
