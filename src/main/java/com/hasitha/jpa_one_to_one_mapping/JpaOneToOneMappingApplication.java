package com.hasitha.jpa_one_to_one_mapping;

import com.hasitha.jpa_one_to_one_mapping.entity.Address;
import com.hasitha.jpa_one_to_one_mapping.entity.Student;
import com.hasitha.jpa_one_to_one_mapping.repository.AddressRepository;
import com.hasitha.jpa_one_to_one_mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class JpaOneToOneMappingApplication{





	public static void main(String[] args) {
		SpringApplication.run(JpaOneToOneMappingApplication.class, args);
	}




}
