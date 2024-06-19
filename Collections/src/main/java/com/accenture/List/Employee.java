package com.accenture.List;

public class Employee {

    private  int id;
    private String name, email;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id = " + id + " " +
                ", name = " + name + '\'' +
                ", email = " + email + '\'' +
                '}';
    }
}
