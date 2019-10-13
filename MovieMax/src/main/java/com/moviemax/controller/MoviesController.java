package com.moviemax.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.moviemax.exception.MovieMaxException;
import com.moviemax.model.Movie;
import com.moviemax.service.MovieService;

@Controller
public class MoviesController {
	
	 @Autowired
	 MovieService movieService;
	 
	 @GetMapping(value="/getMovieMax")
	 public String viewRegistration(Map<String, Object> model) {
	    /*Movie movie = new Movie();
	    model.put("movieForm", movie);*/
	    return "index";
	 }
	 @PostMapping(value="/getMovies")
	 public String getMovies(@ModelAttribute("movieForm") Movie movie,ModelMap model) throws MovieMaxException{
		 model.put("movieList", movieService.getMovies(movie));
		 return "loginsuccess";
	 }
	 
}
