package com.steve.displaytime.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/date")
	public String date(Model viewModel) {
		LocalTime now = LocalTime.now();
		String time = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(now);
		viewModel.addAttribute("time", time);
	
		
		
		
		
		return "date.jsp";
	}
	@GetMapping("/time")
	public String time(Model viewModel) {
		LocalDateTime now = LocalDateTime.now();
		String time = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(now);
		viewModel.addAttribute("time", time);
		
		return "time.jsp";
	}
	

}
