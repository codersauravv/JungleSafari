package com.junglesafari.JungleSafari.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.JungleSafari.Repository.AddPackagesRepository;

import com.junglesafari.JungleSafari.entities.Packages;


@Service
public class PackageService {

	@Autowired
	AddPackagesRepository apackage;
	
	public Packages save(Packages p)
	{
		return apackage.save(p);
	}
}
