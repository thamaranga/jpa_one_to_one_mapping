package com.hasitha.jpa_one_to_one_mapping.entity;

import javax.persistence.*;

@Entity
/*Here this is the child entity*/
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    @OneToOne(mappedBy = "address")
    /*
    * Here, I have to add above annotation since  I am  applying bidirectional
    * mapping here.
    *
    * */
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }




}
