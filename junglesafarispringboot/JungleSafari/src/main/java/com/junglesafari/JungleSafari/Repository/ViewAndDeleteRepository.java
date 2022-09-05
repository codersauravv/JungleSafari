package com.junglesafari.JungleSafari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junglesafari.JungleSafari.entities.Packages;

public interface ViewAndDeleteRepository extends JpaRepository<Packages, Integer> {

}
