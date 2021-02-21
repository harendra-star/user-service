package com.netspend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netspend.response.ProductResponse;

@RestController
@RequestMapping("/seller")
public class SellerController {

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ProductResponse> getProductCount(
			@PathVariable("name") String name) {
		//UserResponse userResponse = userService.findUserByFirstName(firstName);
		ProductResponse productResponse = new ProductResponse(); 
		productResponse.setSku("dsadsadaslkd");
		ResponseEntity<ProductResponse> responseEntity = new ResponseEntity<ProductResponse>(productResponse,
				HttpStatus.FOUND);
		return responseEntity;
	}
}
