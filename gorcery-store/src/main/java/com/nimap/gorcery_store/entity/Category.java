package com.nimap.gorcery_store.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author Gaurav Pawar
 *
 */
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String type;
	
	/*
	 * @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL, mappedBy
	 * = "category")
	 * 
	 * private List<Product> productList;
	 */
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(Integer id, String name, String type, List<Product> productList) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		//this.productList = productList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*
	 * public List<Product> getProductList() { return productList; }
	 * 
	 * public void setProductList(List<Product> productList) { this.productList =
	 * productList; }
	 */
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", type=" + type + ", productList=" + "]";
	}

	
}
