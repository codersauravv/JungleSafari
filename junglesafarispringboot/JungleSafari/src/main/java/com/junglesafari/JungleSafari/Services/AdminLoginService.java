package com.junglesafari.JungleSafari.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.JungleSafari.Repository.AdminLoginRepository;
import com.junglesafari.JungleSafari.entities.Admin;
import com.junglesafari.JungleSafari.entities.Packages;
import com.junglesafari.JungleSafari.entities.User;

@Service
public class AdminLoginService {
	@Autowired
	AdminLoginRepository aRepository;
	
	public Admin save(Admin a)
	{
		return aRepository.save(a);
	}
	
	public String checkAdmin(String username,String password) {
		return aRepository.checkLoginAdmin(username, password);
		
	}
	
	public List<Admin> viewAllAdmin() {
	
		return aRepository.findAll();
	}	
}
