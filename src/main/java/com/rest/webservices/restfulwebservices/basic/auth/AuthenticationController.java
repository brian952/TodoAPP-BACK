package com.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class AuthenticationController {

	@GetMapping("/basicauth")
	public AuthenticationBean helloWorldBean(){
		return new AuthenticationBean("You are authenticated");
	}
}
