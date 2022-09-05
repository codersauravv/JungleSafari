package com.junglesafari.JungleSafari.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.JungleSafari.Repository.CustomerOrderRepository;
import com.junglesafari.JungleSafari.Repository.CustomerOrderRepositoryforOrderTable;
import com.junglesafari.JungleSafari.entities.Admin;
import com.junglesafari.JungleSafari.entities.Orders;
import com.junglesafari.JungleSafari.entities.Packages;


@Service
public class CustomerOrderService {
	@Autowired
		public	CustomerOrderRepository custOrderRepo;
	
	@Autowired
	public CustomerOrderRepositoryforOrderTable custOrderRepoforOrderTable;
	
	public Orders saveOrders(Orders u)
	{
		return custOrderRepoforOrderTable.save(u);
	}
	

	public Optional<Packages> findOrderService(Integer id) {
	return custOrderRepo.findById(id);
	}
	
	public List<Orders> viewAllOrders() {
		
		return custOrderRepoforOrderTable.findAll();
	}	
}
	


