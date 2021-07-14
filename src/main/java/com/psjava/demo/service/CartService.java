package com.psjava.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psjava.demo.model.Cart;
import com.psjava.demo.model.Product;
import com.psjava.demo.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	public Cart cartItem(Cart cart ,Product product) {
		
		Optional<Cart> cartExisting = cartRepository.findById(cart.getId());
		if(cartExisting.isPresent()) {
			cart.setProduct(product);
			
		} else {
			Cart newCart = new Cart();
			cart.setProduct(product);
		}
		
		return cartRepository.save(cart);
		
	}

}
