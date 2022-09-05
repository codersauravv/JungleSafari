package com.junglesafari.JungleSafari.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.JungleSafari.Repository.BuyPackageRepository;
import com.junglesafari.JungleSafari.entities.Packages;


@Service
@Transactional
public class BuyPackageService {
	@Autowired
	public BuyPackageRepository bPackRepository;
	
	public List<Packages> getAllCategory() {
		return bPackRepository.findAll();
	}
	
}
