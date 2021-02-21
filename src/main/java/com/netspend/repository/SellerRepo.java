package com.netspend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.netspend.data.SellerData;

@Repository
public interface SellerRepo extends CrudRepository<SellerData, Long> {

	SellerData findByName(String name);
	
}
