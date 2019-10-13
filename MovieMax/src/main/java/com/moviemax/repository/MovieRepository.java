package com.moviemax.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviemax.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,String> {
	List<Movie> findByCity(String city);
}
