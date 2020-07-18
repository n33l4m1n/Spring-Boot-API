package com.n33l4m1n.github.springbootapi.services;

import java.math.BigDecimal;

public interface HelloWorldService {
	public String getHelloWorld();
	public BigDecimal getStockPrice(String ticker);
}
