package com.akarki.todo.rest.todorestfulwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.akarki.todo.rest.todorestfulwebservices.bean.HelloWorldBean;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

	// @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "hello-world")
	public String helloWorld() {
		return "Hello from Todo REST service";
	}

	@GetMapping(path = "hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
		// return new HelloWorldBean(String.format("Hello World, %s", name));
		throw new RuntimeException("something happened testing");
	}
}
