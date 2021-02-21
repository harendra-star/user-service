package com.netspend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.netspend.data.ColorData;

@Repository
public interface ColorRepo extends CrudRepository<ColorData, Long> {

	ColorData findByName(String name);
}
