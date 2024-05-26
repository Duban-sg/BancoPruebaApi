package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class demoController {
	
	public demoController() {}
	
	@GetMapping(value = "users")
	public String demo(String hola){
		return "Hello world"; 
	}

}
