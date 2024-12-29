package com.example.movies.domain.movie;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(String message) {
        super(message);
    }
}
