package com.moviemax.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviemax.exception.InvalidCityException;
import com.moviemax.exception.InvalidEmailException;
import com.moviemax.exception.InvalidNameException;
import com.moviemax.exception.InvalidPhoneNumberException;
import com.moviemax.exception.MovieMaxException;
import com.moviemax.model.Movie;
import com.moviemax.model.User;
import com.moviemax.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public List<com.moviemax.entity.Movie> getMovies(Movie movie) throws MovieMaxException{
		//validateUser(user);
		List<com.moviemax.entity.Movie> moviesList = movieRepository.findByCity(movie.getCity());
		return moviesList;
	}
	
	public void validateUser(User user) throws MovieMaxException{
		if(!isValidName(user.getName()))	
			throw new InvalidNameException("INVALID_NAME_EXCEPTION");
		if(!isValidEmail(user.getEmail()))
			throw new InvalidEmailException("INVALID_EMAIL_EXCEPTION");
		if(!isValidPhoneNumber(user.getPhoneNumber()))
			throw new InvalidPhoneNumberException("INVALID_PHONE_NUMBER_EXCEPTION");
		if(!isValidCity(user.getCity()))
			throw new InvalidCityException("INVALID_CITY_EXCEPTION");
	}
	
	public boolean isValidName(String name) {
		String regex1 = "^[a-zA-Z0-9]{8,15}+$";
		boolean b1 = false;
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(name);
		if(matcher1.matches())
			b1 = true;
		return b1;
	}
	
	public boolean isValidEmail(String email) {
		String regex1 = "^[A-Za-z0-9+_.-]+@(.+)$";
		boolean b1 = false;
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(email);
		if(matcher1.matches())
			b1 = true;
		return b1;
	}
	
	public boolean isValidPhoneNumber(String phoneNumber) {
		String regex1 = "[0-9]{10}";
		boolean b1 = false;
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(phoneNumber);
		if(matcher1.matches())
			b1 = true;
		return b1;
	}
	
	public boolean isValidCity(String city) {
		String regex1 = "^[a-zA-Z0-9]{8,15}+$";
		boolean b1 = false;
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(city);
		if(matcher1.matches())
			b1 = true;
		return b1;
	}
	
}
