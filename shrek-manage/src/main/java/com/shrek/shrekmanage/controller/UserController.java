package com.shrek.shrekmanage.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {



	@GetMapping("/user")
	public Authentication currentUser(){
		return SecurityContextHolder.getContext().getAuthentication() ;
	}

	@GetMapping("/shrek")
	public String getshrekname(){
		return "shrek";
	}
}
