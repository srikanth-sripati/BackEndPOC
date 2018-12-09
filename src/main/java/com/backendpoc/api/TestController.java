package com.backendpoc.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendpoc.service.StudentService;

@RestController
public class TestController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/testGet")
	Long testGet() {
		return service.getAllStudents();
		
	}
}
