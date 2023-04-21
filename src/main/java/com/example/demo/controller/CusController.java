package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CusController {
	
	@GetMapping("/start")
	public String message(){
		return "HelloWorld";
	}

}
