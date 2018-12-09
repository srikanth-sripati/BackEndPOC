package com.backendpoc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backendpoc.entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer>{
	
	//get
	List<StudentEntity> findAll();
	//save
	StudentEntity save(StudentEntity s);
	
}
