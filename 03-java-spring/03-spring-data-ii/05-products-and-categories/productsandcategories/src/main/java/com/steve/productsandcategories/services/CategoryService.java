package com.steve.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steve.productsandcategories.models.Category;
import com.steve.productsandcategories.models.Product;
import com.steve.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	public CategoryService(CategoryRepository repo) {
		this.cRepo = repo;
	}
	public Category newCategory(Category category) {
		return cRepo.save(category);
	}
	public List<Category> allCategory(){
		return this.cRepo.findAll();
	}
	public List<Category> categoryNotContaining(Product product) {
		return cRepo.findByProductsNotContains(product);
	}
	public Category getSingleCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	

}
