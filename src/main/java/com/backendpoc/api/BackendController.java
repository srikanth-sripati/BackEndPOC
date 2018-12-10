package com.backendpoc.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendpoc.entity.StudentEntity;
import com.backendpoc.service.StudentService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BackendController {

	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	List<StudentEntity> getAllStudents() {
		return service.getAllStudents();
	}
	
	@GetMapping("/students/{id}")
	Optional<StudentEntity> getStudentById(@PathVariable("id") Integer id) {
		return service.getStudentById(id);
	}
	
	@RequestMapping("/delete/{id}")
	ResponseEntity<Integer> deleteById(@PathVariable("id") Integer id) {
		service.deleteById(id);
		return new ResponseEntity<Integer>(HttpStatus.OK);
	}
	@PostMapping("/save")
	void saveStudent(@RequestBody StudentEntity studentEntity) {
		service.saveStudent(studentEntity);;
	}
}
