package com.netspend.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netspend.data.UserData;
import com.netspend.request.UserRequest;
import com.netspend.response.UserResponse;
import com.netspend.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	Environment environment;

	@Autowired
	UserService userService;

	@GetMapping("/status/check")
	public ResponseEntity<String> getStatus() {
		return new ResponseEntity<String>("Sucess port " + environment.getProperty("local.server.port"), HttpStatus.OK);
	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserData> createUser(@Valid @RequestBody UserRequest userRequest) {
		UserData userResponse = userService.createUser(userRequest);
		ResponseEntity<UserData> responseEntity = new ResponseEntity<UserData>(userResponse, HttpStatus.CREATED);
		return responseEntity;
	}

	@GetMapping(path = "/{first_name}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserResponse> getUser(@PathVariable(name = "first_name") String firstName) {
		UserResponse userResponse = userService.findUserByFirstName(firstName);
		ResponseEntity<UserResponse> responseEntity = new ResponseEntity<UserResponse>(userResponse,
				HttpStatus.CREATED);
		return responseEntity;
	}

}
