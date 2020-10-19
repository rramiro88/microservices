package com.learning.ratingsdataservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Rating {
    private String movieId;
    private int rating;
}
