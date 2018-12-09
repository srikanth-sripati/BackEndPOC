package com.backendpoc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendpoc.entity.*;
import com.backendpoc.repository.StudentRepository;
@Service
public class StudentService {
	
	@Autowired
	private StudentRepository sr;
	
	List<StudentEntity> studentList;
	public List<StudentEntity> getAllStudents()
	{
		System.out.println("Trying in servicegetAllStudents");
		return sr.findAll();
	}
	public void saveStudent(StudentEntity s)
	{
		sr.save(s);
	}
	
	public Optional<StudentEntity> getStudentById(Integer id) {
		return sr.findById(id);
	}
	
	public void deleteById(Integer id) {
		sr.deleteById(id);
	}

}
