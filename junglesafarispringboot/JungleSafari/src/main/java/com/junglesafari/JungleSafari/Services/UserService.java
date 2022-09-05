package com.junglesafari.JungleSafari.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.JungleSafari.Repository.UserRepository;
import com.junglesafari.JungleSafari.entities.User;


@Service
public class UserService {
	@Autowired
	UserRepository urepo;
	public User save(User u)
	{
		return urepo.save(u);
	}
}
