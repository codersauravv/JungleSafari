package com.junglesafari.JungleSafari.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.demo.dao.RegularOrdersRepository;
//import com.demo.model.RegularOrders;
import com.junglesafari.JungleSafari.Repository.ViewAndDeleteRepository;
import com.junglesafari.JungleSafari.entities.Packages;

@Service
@Transactional
public class ViewAndDeleteServices {
	@Autowired
	private ViewAndDeleteRepository VARepo;
	
	public List<Packages> getAllOrders() {
		// TODO Auto-generated method stub
		return VARepo.findAll();
	}	

	public String deleteOrder(int id) {
		VARepo.deleteById(id);
		return "Order details deleted for ID= "+id;
	}

}
