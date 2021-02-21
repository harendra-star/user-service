package com.netspend.service;

import com.netspend.data.UserData;
import com.netspend.request.UserRequest;
import com.netspend.response.UserResponse;

public interface UserService {

	UserData createUser(UserRequest user);
	
	UserResponse findUserByFirstName(String firsctName);

}
