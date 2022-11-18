package com.nimap.gorcery_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.gorcery_store.entity.Category;
import com.nimap.gorcery_store.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	// public static void main(String[] args) {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping( method = RequestMethod.POST) // working
	public Category addCategory(@RequestBody Category category) {
		return categoryService.addNewCategory(category);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT) // problem occur
	public Category updateCategory(@PathVariable("id") Integer id,@RequestBody Category category) {
		return categoryService.updateCategory(id, category);
	}

	@RequestMapping(value = "/{di}", method = RequestMethod.GET)
	public Category getCategoryById(@PathVariable("di") Integer id) {
		return categoryService.getCategoryById(id);
	}

	@RequestMapping( method = RequestMethod.GET) // working
	public List<Category> getAllCategory(@RequestParam(defaultValue = "0") int page) {
		

		return categoryService.getAllCategory(page);
	}

	@RequestMapping(value = "/{di}", method = RequestMethod.DELETE)
	public void deleteCategory(@PathVariable Integer di) {
		System.out.println("category id>>>>"+di);
		categoryService.deleteCategory(di);
	}
}
