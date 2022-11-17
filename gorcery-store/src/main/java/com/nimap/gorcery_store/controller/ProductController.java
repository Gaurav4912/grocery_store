package com.nimap.gorcery_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.gorcery_store.entity.Category;
import com.nimap.gorcery_store.entity.Product;
import com.nimap.gorcery_store.service.CategoryService;
import com.nimap.gorcery_store.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Product addCategory(@RequestBody Product product) {
		return productService.addNewProduct(product);
	}

	@RequestMapping (value = "/update/{di}", method = RequestMethod.PUT)
	public Product updateCategory(@PathVariable("di")Integer id, Product product) {
		return productService.updateProduct(id, product);
	}

	@RequestMapping (value = "/view/{di}", method = RequestMethod.GET)
	public Product getCategoryById(@PathVariable("di") Integer id) {
		return productService.getProductById(id);
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public List<Product> getAllCategory(){
		return productService.getAllProduct();
	}
	
	@RequestMapping(value = "/delete/{di}", method = RequestMethod.DELETE)
	public void deleteCategory(Integer id) {
		productService.deleteProduct(id);
	}
}
