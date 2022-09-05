package com.junglesafari.JungleSafari.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junglesafari.JungleSafari.Repository.CustomerOrderRepository;
import com.junglesafari.JungleSafari.Services.CustomerOrderService;
import com.junglesafari.JungleSafari.entities.Admin;
import com.junglesafari.JungleSafari.entities.Orders;
import com.junglesafari.JungleSafari.entities.Packages;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class CustomerOrderController {
	@Autowired
	public CustomerOrderService CustOrderService;
//	public CustomerOrderRepository CustOrderRepo;
	
	@PostMapping("/saveOrder")
	public Orders addNewOrder(@RequestBody Orders orderDetails){
		System.out.println("Orders  added"+orderDetails);
			return CustOrderService.saveOrders(orderDetails);
	}
	
	@GetMapping("/viewOrders")
	public List<Orders> getAllAdmin(){
		System.out.println("/ViewOrders");
		return CustOrderService.viewAllOrders();
	}
	
//	

	
	
//		@GetMapping("/RegularOrdersById/{id}")
//		public Orders getEmployeeById(@PathVariable("id") int id) {
//			System.out.println("in Oder for ID controller");
//				
//		}
	
	@GetMapping("/RegularOrdersById/{id}")
	public Optional<Packages> getOrderById(@PathVariable("id") Integer id) {
	return CustOrderService.findOrderService(id);
}
}