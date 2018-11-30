package com.backendpoc.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendpoc.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer>{
	Iterable<StudentEntity> findAll();
}
