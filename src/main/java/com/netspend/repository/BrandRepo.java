package com.netspend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.netspend.data.Brand;

@Repository
public interface BrandRepo extends CrudRepository<Brand, Long> {

	Brand findByName(String name);
}
