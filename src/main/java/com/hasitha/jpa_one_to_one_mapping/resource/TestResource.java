package com.hasitha.jpa_one_to_one_mapping.resource;

import com.hasitha.jpa_one_to_one_mapping.entity.Address;
import com.hasitha.jpa_one_to_one_mapping.entity.Student;
import com.hasitha.jpa_one_to_one_mapping.repository.AddressRepository;
import com.hasitha.jpa_one_to_one_mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TestResource {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AddressRepository addressRepository;


    @GetMapping("/save")
    public String saveData(){
        Student s= new Student();
		s.setName("hasitha");
		s.setMobile("0713674126");

		Address a= new Address();
		a.setCity("matara");
		s.setAddress(a);

		Student student=studentRepository.save(s);
		if(student.getId()!=null){
		    return "Student with name " +student.getName() +" successfully saved.";
        }else{

		    return "Something went wrong wile saving data.";
        }
    }

    @GetMapping("/retrieve")
    public String retrieveData(){
        Optional<Student> student=studentRepository.findById(Long.parseLong("1"));
        if(student.isPresent()){
            Student stu=student.get();
            Address address=stu.getAddress();
            return "Id "+stu.getId()+" Name "+stu.getName()+" Mobile "+stu.getMobile()+" Address ID "+address.getId()+" City "+address.getCity();
        }else{
            return "No data found";

        }

    }

    /*
    * Since I have mapped bi-directionaly, when query for child entity I get parent
    * entity data also.
    * */
    @GetMapping("/retrieveChild")
    public String retrieveChildData(){
        Optional<Address> address=addressRepository.findById(Long.parseLong("1"));
        if(address.isPresent()){
            Address ads=address.get();
            Student stu=ads.getStudent();
            return "Id "+stu.getId()+" Name "+stu.getName()+" Mobile "+stu.getMobile()+" Address ID "+ads.getId()+" City "+ads.getCity();
        }else{
            return "No data found";

        }

    }

    @GetMapping("/update")
    public String updateData(){
        Optional<Student> student=studentRepository.findById(Long.parseLong("1"));
        if(student.isPresent()){
            Student stu=student.get();
            stu.setName("Thamaranga");
            Address address=stu.getAddress();
            address.setCity("Colombo");
            Student updatedStudent=studentRepository.save(stu);
            return "Id "+updatedStudent.getId()+" Name "+updatedStudent.getName()+" Mobile "+updatedStudent.getMobile()+" Address ID "+updatedStudent.getAddress().getId()+" City "+updatedStudent.getAddress().getCity();
        }else{
            return "No data found for update";

        }

    }

    /**/
    @GetMapping("/delete")
    public String deleteParent(){
        Optional<Student> student=studentRepository.findById(Long.parseLong("1"));
        if(student.isPresent()){
            Student stu=student.get();
            studentRepository.delete(stu);
            return "Student deleted successfully";
        }else{
            return "No data found for  delete";

        }

    }


}
