package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {
	
	@GetMapping(path="/", produces = "application/json")
	public String getEmployee() {
		return "Customer";
	}
}
