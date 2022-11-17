package org.example;

import lombok.Data;

@Data
public class Employee {
    private String firstname;
    private String lastname;
    private int id;
    private int age;
    private Position position;

    public Employee(String firstname, String lastname, int id, int age, Position position) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.age = age;
        this.position = position;
    }

    public Object getLastName() {
        return lastname;
    }

    public Object getFirstName() {
        return firstname;
    }

}
