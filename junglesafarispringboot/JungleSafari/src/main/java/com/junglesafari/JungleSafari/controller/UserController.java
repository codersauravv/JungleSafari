package com.junglesafari.JungleSafari.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.junglesafari.JungleSafari.Services.UserService;
import com.junglesafari.JungleSafari.entities.User;



@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	@Autowired
	UserService uservice;
	
	@PostMapping("/saveUser")
	public User save(@RequestBody User u)
	{
		System.out.println(u);
		return uservice.save(u);
	}
	

	
}
