package com.backendpoc.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendpoc.entity.StudentEntity;
import com.backendpoc.service.StudentService;

@RestController
public class TestController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/testGet")
	String testGet() {
		return service.getAllStudents().get(0).getName();
		
	}
}
