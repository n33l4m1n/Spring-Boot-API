package com.n33l4m1n.github.springbootapi;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

//Test class added ONLY to cover main() invocation not covered by application tests.
@SpringBootTest
public class ApplicationTest {
	
	@Test
	public void main() {
		Application.main(new String[] {});
	}
}