package com.n33l4m1n.github.springbootapi.services;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String getHelloWorld() {
		return "Hello World";
	}
	
	@Override
	public Stock getStock(String ticker) {
		Stock price;
		try {
			price = YahooFinance.get(ticker);
			return price;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public BigDecimal getStockPrice(String ticker) {
		BigDecimal price;
		try {
			price = YahooFinance.get(ticker).getQuote().getPrice();
			return price;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


}
