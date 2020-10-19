package com.learning.ratingsdataservice.resources;

import com.learning.ratingsdataservice.models.Rating;
import com.learning.ratingsdataservice.models.UserRatings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @GetMapping
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 3);
    }

    @RequestMapping("/users/{userId}")
    public UserRatings getUserRatings(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("123", 6),
                new Rating("554", 5)
        );

        return new UserRatings(ratings);
    }
}
