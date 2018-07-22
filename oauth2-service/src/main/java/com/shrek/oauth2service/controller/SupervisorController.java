package com.shrek.oauth2service.controller;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * supervisor 的controller
 * @author shrek
 * create date ：2018年5月31日 下午12:05:33
 */
@RestController
@RequestMapping(value="/supervisor") 
public class SupervisorController {

	@GetMapping("/user")
	public Principal user(Principal user){

		return user;
	}

}
