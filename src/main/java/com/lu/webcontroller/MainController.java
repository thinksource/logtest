package com.lu.webcontroller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

public class MainController {
	private final Logger log = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello(@RequestHeader HttpHeaders headers){
		log.info("hello world");
		return new ResponseEntity<>("My hello "+headers.getAcceptCharset().toString(), HttpStatus.OK);
	}

}
