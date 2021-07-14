package com.psjava.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psjava.demo.model.Product;
import com.psjava.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product registerProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> listAllProduct(){
		return productRepository.findAll();
	}
	
}
