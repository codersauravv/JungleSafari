package com.junglesafari.JungleSafari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
//import com.demo.dto.ResponseDTO;
//import com.demo.model.RegularOrders;
//import com.demo.service.IRegularOrders;
import com.junglesafari.JungleSafari.Services.ViewAndDeleteServices;
import com.junglesafari.JungleSafari.entities.Packages;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class ViewAndDeletePackages {

	@Autowired
	private ViewAndDeleteServices pServices;
	
	@GetMapping("/getViewDelete")
	public List<Packages> getAllOrders(){
		System.out.println("/order");
		return pServices.getAllOrders();
	}
	
	@DeleteMapping("/deleteViewDelete/{oid}")
	public String  inDeleteOrderDetails(@PathVariable(name="oid") int id){
		System.out.println("In delete order details"+id);
		
		String deleteOrder = pServices.deleteOrder(id);
		
		//return new ResponseEntity<>(new ResponseDTO(deleteCustomer), HttpStatus.OK);
		return deleteOrder;
	}
	
}
