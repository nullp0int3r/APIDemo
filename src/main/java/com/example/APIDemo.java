package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "APIDemo")


public interface APIDemo {

	@ApiOperation(value = "echo", notes = "", response = String.class, tags={ "api-demo-controller", })
	@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "OK", response = String.class),
	    @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
	    @ApiResponse(code = 403, message = "Forbidden", response = String.class),
	    @ApiResponse(code = 404, message = "Not Found", response = String.class),
	    @ApiResponse(code = 500, message = "Failure") })
	  @RequestMapping(value = "/echo",
      produces = { "*/*" }, 
      consumes = { "application/json" },
      method = RequestMethod.GET)
  public ResponseEntity<String> echo(@ApiParam(value = "message", required = true) @RequestParam(value = "message", required = true) String message);

}
