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
	
	public long getAllStudents()
	{
		return sr.count();
	}

}
