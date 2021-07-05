package io.javabrain.movieinfoservice.Controllers;


import io.javabrain.movieinfoservice.Models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")

public class MovieInfoController {

    @RequestMapping("/{movieId}")
public Movie getMovieInfo(@PathVariable("movieId") String movieId){

    return new Movie(movieId,"test name");
}


}
