package com.steve.code.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	@GetMapping("/")
	public String index(HttpSession session) {
		session.setAttribute("correctCode", "bushido");
		return "index.jsp";
		
		
		
	}
	@GetMapping("/code")
	public String code() {
		return "code.jsp";
	}
	@RequestMapping(path="/process", method=RequestMethod.POST)
	public String process(HttpSession session,@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		String vCode = (String) session.getAttribute("correctCode");
		if (code.equals(vCode)) {
			return "redirect:/code";
		}
		redirectAttributes.addFlashAttribute("error", "You Must Train Harder");
		return "redirect:/";
	}

}
