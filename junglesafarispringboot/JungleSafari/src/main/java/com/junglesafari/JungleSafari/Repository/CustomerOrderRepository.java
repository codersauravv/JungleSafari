package com.junglesafari.JungleSafari.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junglesafari.JungleSafari.entities.Orders;
import com.junglesafari.JungleSafari.entities.Packages;

@Repository
@Transactional
public interface CustomerOrderRepository extends JpaRepository<Packages, Integer> {
//	public Orders findByPkg_id(int id);
	
}
