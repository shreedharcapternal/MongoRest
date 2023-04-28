package com.example.MongoRest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.MongoRest.model.Address;
import com.example.MongoRest.model.Gender;
import com.example.MongoRest.model.Student;
import com.example.MongoRest.repository.StudentRepository;

@SpringBootApplication
public class MongoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoRestApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner runner(StudentRepository repo) {
		return args-> {
			Address address = new Address("Pune","Bhosari","411039");
			Student student = new Student("Shreedhar","patil","shreedhar@gmail.com",Gender.MALE, address, List.of("CS","TCS"), BigDecimal.TEN, LocalDateTime.now());
			
			repo.insert(student);
			
		};
	}
	

}
