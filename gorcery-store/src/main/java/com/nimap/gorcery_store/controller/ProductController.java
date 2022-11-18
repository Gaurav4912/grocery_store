package com.nimap.gorcery_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nimap.gorcery_store.entity.Product;
import com.nimap.gorcery_store.service.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping( method = RequestMethod.POST)
	public Product addProduct(@RequestBody Product product) {
		return productService.addNewProduct(product);
	}

	@RequestMapping (value = "/{di}", method = RequestMethod.PUT)
	public Product updateProduct(@PathVariable("di")Integer id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}

	@RequestMapping (value = "/{di}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable("di") Integer id) {
		return productService.getProductById(id);
	}
	
	@RequestMapping( method = RequestMethod.GET)
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@RequestMapping(value = "/{di}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("di") Integer id) {
		productService.deleteProduct(id);
	}
}
