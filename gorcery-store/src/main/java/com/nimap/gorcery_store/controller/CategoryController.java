package com.nimap.gorcery_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.gorcery_store.entity.Category;
import com.nimap.gorcery_store.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Category addCategory(@RequestBody Category category) {
		return categoryService.addNewCategory(category);
	}

	@RequestMapping (value = "/update/{di}", method = RequestMethod.PUT)
	public Category updateCategory(@PathVariable("di")Integer id, Category category) {
		return categoryService.updateCategory(id, category);
	}

	@RequestMapping (value = "/view/{di}", method = RequestMethod.GET)
	public Category getCategoryById(@PathVariable("di") Integer id) {
		return categoryService.getCategoryById(id);
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public List<Category> getAllCategory(){
		return categoryService.getAllCategory();
	}
	
	@RequestMapping(value = "/delete/{di}", method = RequestMethod.DELETE)
	public void deleteCategory(Integer id) {
		categoryService.deleteCategory(id);
	}
}
