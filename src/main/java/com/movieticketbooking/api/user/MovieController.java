package com.movieticketbooking.api.user;

import com.movieticketbooking.entity.Movie;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MovieController {
    public Movie addMovie(@RequestBody Movie movie) {
        return null;
    }
    public Movie getMovie(@RequestBody Movie movie) {
        return null;
    }
    public Movie SearchMovie(@RequestBody Movie movie) {
        return null;
    }
}
