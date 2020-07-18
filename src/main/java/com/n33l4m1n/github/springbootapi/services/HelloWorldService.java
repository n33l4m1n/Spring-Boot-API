package com.n33l4m1n.github.springbootapi.services;

import java.math.BigDecimal;

import yahoofinance.Stock;

public interface HelloWorldService {
	public String getHelloWorld();
	public Stock getStock(String ticker);
	public BigDecimal getStockPrice(String ticker);
}
