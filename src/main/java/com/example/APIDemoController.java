package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import io.swagger.annotations.ApiParam;

@Controller
public class APIDemoController implements APIDemo{

    public ResponseEntity<String> echo(@ApiParam(value = "message", required = true) @RequestParam(value = "message", required = true) String message) {

	    return ResponseEntity.ok(message);
	  }
	
}
