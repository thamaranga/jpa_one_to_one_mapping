package com.hasitha.jpa_one_to_one_mapping;

import com.hasitha.jpa_one_to_one_mapping.entity.Address;
import com.hasitha.jpa_one_to_one_mapping.entity.Student;
import com.hasitha.jpa_one_to_one_mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaOneToOneMappingApplication implements CommandLineRunner {


	@Autowired
	StudentRepository studentRepository;



	public static void main(String[] args) {
		SpringApplication.run(JpaOneToOneMappingApplication.class, args);
	}


	@Override
	public void run(String[] args) throws Exception {

		Student s= new Student();
		s.setName("thamaranga");
		s.setMobile("0713757937");

		Address a= new Address();
		a.setCity("kirulapona");
		s.setAddress(a);

		studentRepository.save(s);







	}

}
