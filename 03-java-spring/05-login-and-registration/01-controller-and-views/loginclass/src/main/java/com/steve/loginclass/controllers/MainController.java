package com.steve.loginclass.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.steve.loginclass.models.User;
import com.steve.loginclass.services.UserService;
import com.steve.loginclass.validators.UserValidator;

@Controller
public class MainController {
	@Autowired
	private UserValidator validator;
	@Autowired
	private UserService uService;
	@GetMapping("/")
	public String index() {
		return "redirect:/login";
	}
	@GetMapping("/register") 
		
	public String register(@ModelAttribute("user")User user) {
		return "registration.jsp";
	}
	
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("user")User user, BindingResult result, HttpSession session) {
		validator.validate(user, result);
		if(result.hasErrors()) {
			return "registration.jsp";
		}
		User newUser = uService.newUser(user);
		session.setAttribute("user__Id", newUser.getId());
		return "redirect:/home";
	}
	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}
	@PostMapping("/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model viewModel, HttpSession session, RedirectAttributes attrs) {
		if (uService.loginUser(email, password)) {
			User user = this.uService.findByEmail(email);
			session.setAttribute("user__Id", user.getId());
			return "redirect:/home";
		}
		attrs.addFlashAttribute("error", "Invalid Credentionals");
		return "redirect:/login";
	}
	@GetMapping("/home")
	public String home(HttpSession session, Model viewModel) {
		Long user__Id = (Long)session.getAttribute("user__Id");
		if (user__Id == null) {
			return "redirect:/login";
		}
		User user = uService.getSingleUser(user__Id);
		viewModel.addAttribute("user", user);
		return "home.jsp";
	       
	    }
	@GetMapping("/logout")
	public String logoutUser(HttpSession session){
		session.invalidate();
		return "redirect:/login";
		
	}
}
