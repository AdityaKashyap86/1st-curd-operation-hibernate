package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String mobile;

    @Column
    private String address;

    @Column(unique = true)
    private String email;

    public Student (){}

    public Student(String firstName, String lastName, String mobile, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Student student = (Student) o;
        return Objects.equals (id, student.id) && Objects.equals (firstName, student.firstName) && Objects.equals (lastName, student.lastName) && Objects.equals (mobile, student.mobile) && Objects.equals (address, student.address) && Objects.equals (email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash (id, firstName, lastName, mobile, address, email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
