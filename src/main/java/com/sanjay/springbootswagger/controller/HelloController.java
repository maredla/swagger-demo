package com.sanjay.springbootswagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/hello")
@Api(value ="HelloWorld Controller ")
public class HelloController {

	@ApiOperation(value = "Returns hello User!!!")
	@ApiResponses(
			value = {
					@ApiResponse(code = 100, message = "100 is valid response"),
					@ApiResponse(code = 200, message = "returns hello user")
			}
			)

	@GetMapping
	public String hello() {
		System.out.println("In GET Method ");
		return "Hello User!!!";
	}

	@PostMapping
	public String helloPost(@RequestBody final String hello) {
		System.out.println("In Post Method "+hello);
		return hello;
	}

	@PutMapping
	public String helloPut(@RequestBody final String hello) {
		System.out.println("In Put Method "+hello);
		return hello;
	}

}
