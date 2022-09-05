package com.junglesafari.JungleSafari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junglesafari.JungleSafari.Services.AdminLoginService;
import com.junglesafari.JungleSafari.entities.Admin;
import com.junglesafari.JungleSafari.entities.Packages;


@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class AdminLoginController {

	@Autowired
	public AdminLoginService aService;
	
	@PostMapping("/addAdmin")
	public Admin save(@RequestBody Admin p)
	{
		System.out.println(p);
		return aService.save(p);
	}
	
	
	@GetMapping("/checkAdminLogin")	
	public String checkLogin(@RequestParam ("username")String username,@RequestParam ("password")String password)
	{
		return	aService.checkAdmin(username, password);		
	}
	
	

	@GetMapping("/viewAdmin")
	public List<Admin> getAllAdmin(){
		System.out.println("/ViewAdmin");
		return aService.viewAllAdmin();
	}
	
}
