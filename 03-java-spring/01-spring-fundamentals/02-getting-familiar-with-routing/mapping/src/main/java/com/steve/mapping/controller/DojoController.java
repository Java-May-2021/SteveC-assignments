package com.steve.mapping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="dojo", method=RequestMethod.GET)
public class DojoController {
	@RequestMapping(value="", method=RequestMethod.GET)
	public String dojo() {
		return "The dojo is awesome!";
	}
	@RequestMapping(value="/burbank", method=RequestMethod.GET)
	public String burbank() {
		return "Burbank Dojo is located in Southern California";
	}
	@RequestMapping(value="/san-jose", method=RequestMethod.GET)
	public String sanJose() {
		return "SJ dojo is the headquarters";
	}
}
