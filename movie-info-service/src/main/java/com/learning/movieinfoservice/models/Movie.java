package com.learning.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Movie {
    private String movieId;
    private String name;
}
