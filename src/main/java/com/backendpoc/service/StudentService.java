package com.backendpoc.service;

import java.util.List;
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

}
