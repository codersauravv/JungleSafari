package com.junglesafari.JungleSafari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.junglesafari.JungleSafari.Services.LoginService;
import com.junglesafari.JungleSafari.entities.User;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/user")
public class LoginController {
	@Autowired
	LoginService lService;
	
	@GetMapping("/checkLogincustomer")
	public String checkLogin(@RequestParam ("username")String username,@RequestParam ("password")String password)
	{
		return lService.checkLoginCustomer(username, password);
		
	}
	
//	@GetMapping("/checkLogincustomer")
//	public String checkLogin(@RequestParam String email,@RequestParam String password) {
//		return lService.findByEmailAndPassword(email, password);
//	}
	
//	@PostMapping("/checkLogincustomer")
//	public Object checkLogin(@RequestBody User u)
//	{
//		return lService.checkLoginCustomer(u.getEmail(),u.getPassword());
//	}
	
}
