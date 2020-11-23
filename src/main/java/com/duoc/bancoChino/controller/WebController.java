package com.duoc.bancoChino.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
}