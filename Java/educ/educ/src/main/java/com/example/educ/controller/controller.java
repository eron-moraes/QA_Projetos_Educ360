package com.example.educ.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/teste")
	public String olaMundo() {
		return "Ola Mundo";
	}
	
}
