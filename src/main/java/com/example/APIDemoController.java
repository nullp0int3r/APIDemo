package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIDemoController {

	
	@RequestMapping(value = "/echo", method = RequestMethod.GET)
	  public ResponseEntity<String> echo(@RequestParam(value = "message") String message) {
	    return ResponseEntity.ok(message);
	  }
	
}
