package com.junglesafari.JungleSafari.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.JungleSafari.Repository.LoginRepositoy;


@Service
public class LoginService {
	@Autowired
	LoginRepositoy lrepo;

	public String checkLoginCustomer(String username,String password) {
		return lrepo.checkLogin(username, password);
		
	}
	
//	public String findByEmailAndPassword(String email,String password) {
//		return lrepo.findByEmailAndPassword(email, password);
//	}
	
}
