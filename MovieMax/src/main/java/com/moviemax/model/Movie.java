package com.moviemax.model;

public class Movie {
	private String movieId;
	private String movieName;
	private String city;
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Movie() {
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Movie(String movieId, String movieName,String city) {
		this.movieId=movieId;
		this.movieName=movieName;
		this.city=city;
	}
	
}
