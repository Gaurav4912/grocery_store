package com.nimap.gorcery_store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.gorcery_store.dao.CategoryRepository;
import com.nimap.gorcery_store.entity.Category;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public Category addNewCategory(Category category){
		return categoryRepository.save(category);
	}
	
	public Category updateCategory(Integer id, Category category) {
		category.setId(id);
		return categoryRepository.save(category);
	}

	public Category getCategoryById(Integer id) {
		return categoryRepository.getById(id);
	}
	
	public void deleteCategory(Integer id) {
		Category category = getCategoryById(id);
		categoryRepository.delete(category);
	}
	
	public List<Category> getAllCategory(){
		return categoryRepository.findAll();
	}
}
