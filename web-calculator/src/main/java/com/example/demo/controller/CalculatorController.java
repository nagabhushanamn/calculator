package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Calculator;

@RestController
class CalculatorController {
	@Autowired
	private Calculator calculator;

	@RequestMapping("/sum")
	public String add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return String.valueOf(calculator.add(a, b));
	}
}