package com.steve.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/counter")
	public String counter(HttpSession session, Model viewModel) {
		if(session.getAttribute("count") == null ) {
			session.setAttribute("count", 0);
			
		}
		viewModel.addAttribute("totalCount",session.getAttribute("count"));
		return "index.jsp";
	}
	@GetMapping("/")
	public String count(HttpSession session){
       
        Integer currentCount = (Integer) session.getAttribute("count");
       
        currentCount++;
      
        session.setAttribute("count", currentCount);
        return "welcome.jsp";
    }
}



