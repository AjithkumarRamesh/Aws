package com.tech.awsproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsProject {
	@GetMapping("get")
	public String get() {
		return "AWS Project run";
	}

}
