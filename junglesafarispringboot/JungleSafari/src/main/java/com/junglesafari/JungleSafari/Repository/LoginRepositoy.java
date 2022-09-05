package com.junglesafari.JungleSafari.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.junglesafari.JungleSafari.entities.User;

@Repository
@Transactional
public interface LoginRepositoy extends JpaRepository<User, Integer>{
	
//	public String findByEmailAndPassword(String email,String password);
	
	@Query(value= "select u.email,u.password from User u where u.email =:username and u.password =:password")
	public String checkLogin( @Param ("username") String username,@Param ("password")String password);
	
//	@Query(value= "select *  from user ")
//	public String checkLogin( @Param ("username") String username);
	
//	@Query(value= "select l.customer from Customer l where l.cemail=:username and l.cpassword=:password")
//	public String checkLogin( @Param ("username")String username,@Param ("password")String password);
}
