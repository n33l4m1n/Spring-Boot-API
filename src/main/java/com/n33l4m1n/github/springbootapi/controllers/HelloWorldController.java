package com.n33l4m1n.github.springbootapi.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.n33l4m1n.github.springbootapi.services.HelloWorldService;

@RestController
public class HelloWorldController {
	
	@Autowired
	HelloWorldService helloWorldService;
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return helloWorldService.getHelloWorld();
	}
	
	@PostMapping("/getStockPrice")
	public BigDecimal getStockQuote(@RequestBody String ticker) {
		return helloWorldService.getStockPrice(ticker);
	}
}
