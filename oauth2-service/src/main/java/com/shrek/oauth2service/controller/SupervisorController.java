package com.shrek.oauth2service.controller;

import com.shrek.oauth2service.entity.Supervisor;
import com.shrek.oauth2service.entity.SupervisorExample;
import com.shrek.oauth2service.service.SupervisorService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

/**
 * supervisor 的controller
 * @author shrek
 * create date ：2018年5月31日 下午12:05:33
 */
@RestController
@RequestMapping(value="/supervisor") 
@Api(value = "SupervisorController", tags = "Supervisor相关的api")
public class SupervisorController {

	@GetMapping("/user")
	public Principal user(Principal user){

		return user;
	}

}
