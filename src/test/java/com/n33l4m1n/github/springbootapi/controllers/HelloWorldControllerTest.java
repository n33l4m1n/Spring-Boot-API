package com.n33l4m1n.github.springbootapi.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.n33l4m1n.github.springbootapi.Application;
import com.n33l4m1n.github.springbootapi.services.HelloWorldService;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=Application.class)
public class HelloWorldControllerTest {

	@Autowired
	private HelloWorldController helloWorldController;
	
	@Autowired
	HelloWorldService helloWorldService;

	@Test
	public void helloWorldControllerLoads() throws Exception {
		assertNotNull(helloWorldController);
	}
}