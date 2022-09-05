package com.junglesafari.JungleSafari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junglesafari.JungleSafari.entities.Packages;

@Repository
public interface BuyPackageRepository  extends JpaRepository<Packages, Integer> {

}
