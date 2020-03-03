package com.akarki.todo.rest.todorestfulwebservices.basic.auth.bean;

import lombok.Data;

@Data
public class AuthenticationBean {

	public AuthenticationBean(String message) {
		this.message = message;
	}

	private String message;
}
