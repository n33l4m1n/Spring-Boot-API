package com.n33l4m1n.github.springbootapi.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String getHelloWorld() {
		return "Hello World";
	}

}
