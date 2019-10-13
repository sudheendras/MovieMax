package com.moviemax.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.moviemax.entity.User;
import com.moviemax.exception.MovieMaxException;
import com.moviemax.repository.LoginRepository;
import com.moviemax.repository.UserRepository;

@Controller
public class SignUpController {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	LoginRepository loginRepository;
	
	@GetMapping(value="/signUp")
	 public String viewRegistration(Map<String, Object> model) {
	    com.moviemax.model.User user = new com.moviemax.model.User();
	    model.put("userForm", user);
	    return "signup";
	 }
	 @PostMapping(value="/signUp")
	 public String createUser(@ModelAttribute("userForm") com.moviemax.model.User userForm,ModelMap model) throws MovieMaxException{
		 User user = new User();
		 user.setName(userForm.getName());
		 user.setEmail(userForm.getEmail());
		 user.setCity(userForm.getCity());
		 user.setPhoneNumber(userForm.getPhoneNumber());
		 user.setUsername(userForm.getUsername());
		 user.setPassword(userForm.getPassword());
		 userRepository.save(user);
		 com.moviemax.entity.Login login = new com.moviemax.entity.Login();
		 login.setUsername(userForm.getUsername());
		 login.setPassword(userForm.getPassword());
		 loginRepository.save(login);
		 model.put("success", "Your account has been created successfully!!" );
		 return "index";
	 }
}
