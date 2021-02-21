package com.netspend.service;

import java.util.Set;

import com.netspend.data.Product;
import com.netspend.request.ProductRequest;

public interface ProductService {

	public Set<Product> search(ProductRequest productRequest);
}
