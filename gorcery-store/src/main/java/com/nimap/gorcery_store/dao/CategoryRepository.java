package com.nimap.gorcery_store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimap.gorcery_store.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
