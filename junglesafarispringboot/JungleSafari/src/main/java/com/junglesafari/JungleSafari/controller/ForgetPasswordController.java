package com.junglesafari.JungleSafari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junglesafari.JungleSafari.dto.ErrorResponse;
import com.junglesafari.JungleSafari.Repository.AdminLoginRepository;
import com.junglesafari.JungleSafari.Repository.UserRepository;
import com.junglesafari.JungleSafari.entities.Admin;
import com.junglesafari.JungleSafari.entities.User;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class ForgetPasswordController {
	@Autowired
	public UserRepository uRepository;
	
	@Autowired
	public AdminLoginRepository aRepository;
	
	//ForUser
	@PostMapping("/updateUser")
	public ResponseEntity<?> updateUser(@RequestBody User TransientAdmin) {
		System.out.println("In UpdateAdmin" + TransientAdmin);
		try {
			
			String email = TransientAdmin.getEmail();

			String contactNo = TransientAdmin.getContact_no();
		
			String password = TransientAdmin.getPassword();
			
			User l = uRepository.checkEmail(email);
			System.out.println(l+"Updated");
			System.out.println(email+" "+contactNo+" "+password);
			System.out.println(l.getContact_no());
			if (l != null) {
//				System.out.println("In if   block 1 ");
				if (l.getContact_no().equals(contactNo)) {
					l.setPassword(password);
//					System.out.println("In if block 2 ");
					User updatedUser = uRepository.save(l);
					return ResponseEntity.ok(updatedUser);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}

			} else {
//				System.out.println("In else block");
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
//			System.out.println("In catch block");
			return new ResponseEntity<>(new ErrorResponse("adding new User failed", e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//for Admin
	@PostMapping("/updateAdmin")
	public ResponseEntity<?> updateAdmin(@RequestBody Admin TransientAdmin) {
//		System.out.println("In UpdateAdmin" + TransientAdmin);
		try {
			String email = TransientAdmin.getAemail();
			String secreate = TransientAdmin.getSecretcode();
			String password = TransientAdmin.getPassword();
			
			Admin l = aRepository.checkEmail(email);
			System.out.println(email+" "+secreate+" "+password);
			System.out.println(l);
			if (l != null) {
//				System.out.println("In if   block 1 ");
				if (l.getSecretcode().equals(secreate)) {
					l.setPassword(password);
//					System.out.println("In if block 2 ");
					Admin updatedAdmin = aRepository.save(l);
					return ResponseEntity.ok(updatedAdmin);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}
				
			} else {
				System.out.println("In else block");
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
		} catch (Exception e) {
			System.out.println("In catch block");
			return new ResponseEntity<>(new ErrorResponse("adding new admin failed", e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
