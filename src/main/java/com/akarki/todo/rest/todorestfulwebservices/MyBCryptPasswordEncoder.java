package com.akarki.todo.rest.todorestfulwebservices;

import java.util.Scanner;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.var;

public class MyBCryptPasswordEncoder {

	public static void main(String[] args) {
		var encoder = new BCryptPasswordEncoder();

		var scanner = new Scanner(System.in);
		System.out.println("Please enter password to encode:");
		var toBeEncodedPassword = scanner.nextLine();

		System.out.println("Here is your encoded password:" + encoder.encode(toBeEncodedPassword));

		scanner.close();
	}

}
