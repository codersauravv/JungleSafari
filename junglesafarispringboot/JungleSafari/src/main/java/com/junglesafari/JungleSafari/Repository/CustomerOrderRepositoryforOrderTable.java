package com.junglesafari.JungleSafari.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junglesafari.JungleSafari.entities.Orders;

@Repository
@Transactional
public interface CustomerOrderRepositoryforOrderTable  extends JpaRepository<Orders, Integer>{

}
