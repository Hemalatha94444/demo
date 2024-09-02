package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/api")
public class DemoController {
@GetMapping("/welcome")
public String welcome() {
	return "WELCOME TO DEMO APPLICATION...";
}
@GetMapping("/greeting")
public String greeting() {
	return "GREETING TO DEMO APPLICATION...";
}
@GetMapping("/hello")
public String hello() {
	return "HELLO TO DEMO APPLICATION...";
}
}
