package com.junglesafari.JungleSafari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.junglesafari.JungleSafari.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value= "select l from User l where l.email=:email ")
	public User checkEmail( @Param ("email")String email);
	
}
