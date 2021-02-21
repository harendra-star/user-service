package com.netspend.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netspend.data.UserData;
import com.netspend.exception.UserNotFoundException;
import com.netspend.mappers.UserResponseMapper;
import com.netspend.repository.UserRepo;
import com.netspend.request.UserRequest;
import com.netspend.response.UserResponse;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public UserData createUser(UserRequest user) {

		return userRepo.save(convertor(user));
	}

	@Override
	public UserResponse findUserByFirstName(String firstName) {
		List<UserData> userDatas = userRepo.findByFirstName(firstName);
		UserResponse userResponse = new UserResponse();
		if (userDatas == null || userDatas.isEmpty()) {
			throw new UserNotFoundException("User does not exist with this name"); 
		} else {
			BeanUtils.copyProperties(userDatas.get(0), userResponse);
		}
		return userResponse;
	}

	private UserData convertor(UserRequest user) {
		UserData userData = new UserData();
		if (user != null) {

			userData.setFirstName(user.getFirstName());
			userData.setLastName(user.getLastName());
			userData.setPassword(user.getPassword());
			userData.setEmail(user.getEmail());
		}
		return userData;
	}
}
