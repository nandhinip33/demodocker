package com.example.demodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemodockerController {
	@GetMapping(value="/admin")
	public String getMsg() {
		return "Hello Docker";
	}
	

}
