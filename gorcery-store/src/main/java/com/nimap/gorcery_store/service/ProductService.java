package com.nimap.gorcery_store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.gorcery_store.dao.ProductRepository;
import com.nimap.gorcery_store.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	public Product addNewProduct(Product product){
		return productRepository.save(product);
	}
	
	public Product updateProduct(Integer id, Product product) {
		product.setId(id);
		return productRepository.save(product);
	}

	public Product getProductById(Integer id) {
		return productRepository.getById(id);
	}
	
	public void deleteProduct(Integer id) {
		Product product = getProductById(id);
		productRepository.delete(product);
	}
	
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}

}
