package com.netspend.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.netspend.data.Brand;
import com.netspend.data.Product;
import com.netspend.repository.BrandRepo;
import com.netspend.request.ProductRequest;

@Service
public class ProductServiceImpl implements ProductService {
	
	private final BrandRepo brandRepo;	
	

	public ProductServiceImpl(BrandRepo brandRepo) {
		this.brandRepo = brandRepo;
	}


	@Override
	public Set<Product> search(ProductRequest productRequest) {
		Brand brandData = brandRepo.findByName(productRequest.getBrandName());
		return brandData.getProducts();
	}

}
