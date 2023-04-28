package com.example.MongoRest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.MongoRest.model.Student;

public interface StudentRepository extends MongoRepository<Student,String> {
	
	
	
}
