package com.moviemax.exception;

public class InvalidNameException extends MovieMaxException{
	
	public InvalidNameException(String name) {
		super(name);
	}
}
