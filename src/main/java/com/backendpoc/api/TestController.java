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
<<<<<<< HEAD
	StudentEntity testGet() {
		return service.getAllStudents().get(0);
=======
	List<StudentEntity> testGet() {
		return service.getAllStudents();
>>>>>>> branch 'master' of https://github.com/srikanth-sripati/BackEndPOC.git
		
	}
}
