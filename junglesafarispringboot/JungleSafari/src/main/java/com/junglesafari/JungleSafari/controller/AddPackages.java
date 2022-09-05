package com.junglesafari.JungleSafari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junglesafari.JungleSafari.Services.PackageService;
import com.junglesafari.JungleSafari.entities.Packages;


@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/admin")
public class AddPackages {
	@Autowired
	PackageService pService;
	
	@PostMapping("/addpackages")
	public Packages save(@RequestBody Packages p)
	{
		System.out.println(p);
		return pService.save(p);
	}
	
}
