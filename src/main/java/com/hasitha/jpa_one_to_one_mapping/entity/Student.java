package com.hasitha.jpa_one_to_one_mapping.entity;



import javax.persistence.*;

@Entity
/*Here this is the parent entity*/
public class Student {

    @Id //This annotation says this is the primary key of Student entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
    * @GeneratedValue annotation is used to specify the primary key generation strategy.
    *
    * */
    private Long id;
    private String name;
    private String mobile;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)

    /*
    * @OneToOne – This annotation creates one to one relationship
    * between Student and Address entities.
    * The cascade property (CascadeType.ALL) defines what should happen
    * with child table records when something happens with parent table records.
    * CascadeType.ALL means On DELETE, UPDATE , INSERT operations in parent table child
    * table should also be affected.
    *
    *
    * @JoinColumn – You can define column which creates foreign key
    * in a table. In our example, ADDRESS_ID is a foreign key in STUDENT table
    * which references to ID in ADDRESS table.
    *
    * Here Student is the parent entity.
    *
    * CascadeType.ALL means when we perform any action (SAVE, UPDATE , DELETE etc..) for
    * parent entity apply
    * that action for child entity also.
    *
    * */
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
