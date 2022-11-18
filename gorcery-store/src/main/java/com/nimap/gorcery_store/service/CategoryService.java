package com.nimap.gorcery_store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
		System.out.println(category.getName());
		return categoryRepository.save(category);
	}

	public Category getCategoryById(Integer id) {
		return categoryRepository.getById(id);
	}
	
	public void deleteCategory(Integer id) {
		System.out.println(">>>"+id);
		Category category = getCategoryById(id);
		System.out.println("Category"+category.toString());
		categoryRepository.delete(category);
	}
	
	public List<Category> getAllCategory(int page){
	//	Pageable
      /*paging = PageRequest.of(page, 3);
		
		Page<Category> pageTuts =categoryRepository.findAll(paging);
*/

		return categoryRepository.findAll();
	}
}
