package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(unique = true,nullable = false)
    private String mobileNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


    public Customer(){}

    public Customer(String firstName, String lastName, String email, String mobileNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Customer customer = (Customer) o;
        return Objects.equals (id, customer.id) && Objects.equals (firstName, customer.firstName) && Objects.equals (lastName, customer.lastName) && Objects.equals (email, customer.email) && Objects.equals (mobileNumber, customer.mobileNumber) && Objects.equals (address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash (id, firstName, lastName, email, mobileNumber, address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
