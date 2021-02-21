package com.netspend.controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netspend.data.Product;
import com.netspend.request.ProductRequest;
import com.netspend.service.ProductService;

//This controller class supports changes 1234
@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private ProductService productService;

	public SearchController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Set<Product>> getProducts(@RequestParam("brand") Optional<String> brand,
			@RequestParam("price") Optional<Double> price, @RequestParam("color") Optional<String> color,
			@RequestParam("size") Optional<String> size, @RequestParam("brand") Optional<String> sku) {
		ProductRequest productRequest = new ProductRequest();
		productRequest.setBrandName(brand.get());
		Set<Product> datas = productService.search(productRequest);
		ResponseEntity<Set<Product>> responseEntity = new ResponseEntity<Set<Product>>(datas, HttpStatus.OK);
		return responseEntity;
	}

}
