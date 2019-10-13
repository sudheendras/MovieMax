package com.moviemax.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.moviemax.exception.MovieMaxException;
import com.moviemax.model.Login;
import com.moviemax.model.Movie;
import com.moviemax.repository.LoginRepository;

@Controller
public class LoginController {

	@Autowired
	LoginRepository loginRepository;
	
	@GetMapping(value="/login")
	 public String viewRegistration(Map<String, Object> model) {
	    com.moviemax.model.Login login = new com.moviemax.model.Login();
	    model.put("loginForm", login);
	    return "login";
	 }
	 @PostMapping(value="/login")
	 public String createUser(@ModelAttribute("loginForm") com.moviemax.model.Login loginForm,ModelMap model) throws MovieMaxException{
		 com.moviemax.entity.Login login = loginRepository.getOne(loginForm.getUserName());
		 if(login.getPassword().equals(loginForm.getPassword())) {
			 Movie movie = new Movie();
			 model.put("movieForm", movie);
			 return "loginsuccess";
		 }
		 else {
			 model.put("failure", "Login Failure!!");
			 return "login";
		 }
	 }
}
