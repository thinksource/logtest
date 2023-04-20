package com.lu.logtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogtestApplicationTests {
	
	private final Logger log = LoggerFactory.getLogger(LogtestApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("inside test now");
		Assertions.assertEquals("=", "=");
	}
	

}
