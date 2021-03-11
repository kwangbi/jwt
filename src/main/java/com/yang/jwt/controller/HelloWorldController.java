package com.yang.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yang.jwt.config.JwtTokenUtil;

@RestController
public class HelloWorldController {
	
	@RequestMapping({ "/hello" })
	public String firstPage() {
		
		
		return "Hello world";
	}
}
