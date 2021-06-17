package com.steve.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.steve.productsandcategories.models.Category;
import com.steve.productsandcategories.models.Product;
import com.steve.productsandcategories.services.CategoryService;
import com.steve.productsandcategories.services.ProductService;

@Controller
public class MainController {
	@Autowired
	private ProductService pService;
	@Autowired
	private CategoryService cService;
	@GetMapping("/products/new")
	public String index(@ModelAttribute("product")Product product) {
		return "newProduct.jsp";
	}
	@PostMapping("/products/new")
	public String newProduct(@Valid @ModelAttribute("product")Product product,BindingResult result) {
		if(result.hasErrors()) {
			return"newProduct.jsp";
		}
		this.pService.newProduct(product);
		return "redirect:/products/new";
	}
	@GetMapping("categories/new")
	public String newCategory(@ModelAttribute("category")Category category) {
		return "newCategory.jsp";
	}
	@PostMapping("categories/new")
	public String addCategory(@Valid @ModelAttribute("category")Category category, BindingResult result) {
		if(result.hasErrors()) {
			return"newCategory.jsp";
		}
		this.cService.newCategory(category);
		return"redirect:/categories/new";
	}
	@GetMapping("products/{id}")
	public String showProduct(@PathVariable("id")Long id, Model viewModel) {
		Product product = pService.getSingleProduct(id);
		viewModel.addAttribute("allCategory", this.cService.categoryNotContaining(product));
		viewModel.addAttribute("product", product);
		return "showProduct.jsp";
		
	}
	@GetMapping("category/add/{id}")
	public String addToCategory(@PathVariable("id")Long id, @RequestParam(value="cat_id") Long catid) {
		Product productid = this.pService.getSingleProduct(id);
		Category categoryid = this.cService.getSingleCategory(catid);
		this.pService.addToCat(categoryid, productid);
		return "redirect:/products/{id}";
	}
	@GetMapping("categories/{id}")
	public String showCategory(@PathVariable("id")Long id, Model viewModel) {
		Category category = cService.getSingleCategory(id);
		
		viewModel.addAttribute("allProduct", this.pService.productNotContaining(category));
		viewModel.addAttribute("category", category);
		return"showCategory.jsp";
	}
	@GetMapping("product/add/{id}")
	public String addToProduct(@PathVariable("id")Long id, @RequestParam(value="pro_id") Long proid) {
		Product productid = this.pService.getSingleProduct(proid);
		Category categoryid = this.cService.getSingleCategory(id);
		this.pService.addToCat(categoryid, productid);
		return "redirect:/categories/{id}";
	}
	

}
