package com.akarki.todo.rest.todorestfulwebservices.bean;

import lombok.Data;

@Data
public class HelloWorldBean {

	public HelloWorldBean(String message) {
		this.message = message;
	}
	
	private String message;
}
