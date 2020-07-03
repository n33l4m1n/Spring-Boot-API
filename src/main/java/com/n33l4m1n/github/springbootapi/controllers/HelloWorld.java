package com.n33l4m1n.github.springbootapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	  @GetMapping("/helloWorld")
	  public String helloWorld() {
	    return "Hello World!";
	  }
}
