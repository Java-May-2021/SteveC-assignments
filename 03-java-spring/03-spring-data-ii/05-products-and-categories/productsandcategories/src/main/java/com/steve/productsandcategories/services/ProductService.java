package com.steve.productsandcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steve.productsandcategories.models.Category;
import com.steve.productsandcategories.models.Product;
import com.steve.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository pRepo;
	public ProductService(ProductRepository repo) {
		this.pRepo = repo;
	}
	public List<Product> allProduct(){
		return this.pRepo.findAll();
	}
	public Product newProduct(Product product) {
		return this.pRepo.save(product);
	}
	public Product getSingleProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public void addToCat(Category category, Product product) {
		List<Category>currentCategory = product.getCategories();
		currentCategory.add(category);
		this.pRepo.save(product);
	}
	public List<Product> productNotContaining(Category category) {
		return pRepo.findByCategoriesNotContains(category);
	}
	

}
