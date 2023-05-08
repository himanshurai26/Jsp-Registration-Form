
package com.entities;

/**
 *
 * @author Himanshu Kumar
 */
public class Employee {
    private int id;
    private String name;
    private String email;
    private String dob;
    private String number;
    private String address;
    private String gender;
    private String password;

    public Employee(String name, String email, String dob, String number, String address, String gender, String password) {
       // this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.number = number;
        this.address = address;
        this.gender = gender;
        this.password = password;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
