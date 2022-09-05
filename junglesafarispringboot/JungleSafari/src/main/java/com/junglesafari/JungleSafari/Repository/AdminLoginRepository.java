package com.junglesafari.JungleSafari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.junglesafari.JungleSafari.entities.Admin;


public interface AdminLoginRepository  extends JpaRepository<Admin, Integer>{
	
	@Query(value= "select l from Admin l where l.aemail=:email ")
	public Admin checkEmail( @Param ("email")String email);
	
	@Query(value= "select u.aemail,u.password from Admin u where u.aemail =:username and u.password =:password")
	public String checkLoginAdmin( @Param ("username") String username,@Param ("password")String password);
	
}
