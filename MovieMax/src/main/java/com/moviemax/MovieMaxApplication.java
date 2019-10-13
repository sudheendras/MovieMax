package com.moviemax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages={"com.moviemax.service","com.moviemax.controller"})
public class MovieMaxApplication extends SpringBootServletInitializer{

	@Autowired
	private ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		SpringApplication.run(MovieMaxApplication.class, args);
	}

}
