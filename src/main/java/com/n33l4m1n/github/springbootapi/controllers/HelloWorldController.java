package com.n33l4m1n.github.springbootapi.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.n33l4m1n.github.springbootapi.services.HelloWorldService;

import yahoofinance.Stock;

@RestController
public class HelloWorldController {
	
	@Autowired
	HelloWorldService helloWorldService;
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return helloWorldService.getHelloWorld();
	}
	
	@PostMapping("/getStock")
	public Stock getStock(@RequestBody String ticker) {
		return helloWorldService.getStock(ticker);
	}
	
	@PostMapping("/getStockPrice")
	public BigDecimal getStockPrice(@RequestBody String ticker) {
		return helloWorldService.getStockPrice(ticker);
	}
}
