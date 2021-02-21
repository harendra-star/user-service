package com.netspend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.netspend.data.UserData;

@Repository
public interface UserRepo extends CrudRepository<UserData, Long> {

	List<UserData> findByFirstName(String firstName);
}
