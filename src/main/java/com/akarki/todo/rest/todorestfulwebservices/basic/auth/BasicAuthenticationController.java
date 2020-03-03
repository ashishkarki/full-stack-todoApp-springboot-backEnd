package com.akarki.todo.rest.todorestfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akarki.todo.rest.todorestfulwebservices.basic.auth.bean.AuthenticationBean;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {

	@GetMapping(path = "/basicauth")
	public AuthenticationBean basicAuthBean() {
		return new AuthenticationBean("Your are authenticated now");
	}
}
