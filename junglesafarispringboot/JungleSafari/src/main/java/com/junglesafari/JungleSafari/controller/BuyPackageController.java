package com.junglesafari.JungleSafari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junglesafari.JungleSafari.Services.BuyPackageService;
import com.junglesafari.JungleSafari.entities.Packages;


@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class BuyPackageController {

	@Autowired
	public BuyPackageService bPackageServ;
	
	//get all customers
	@GetMapping("/packages")
	public List<Packages> getAllCategory(){
		System.out.println("/categories");
		return bPackageServ.getAllCategory();
	}
}
