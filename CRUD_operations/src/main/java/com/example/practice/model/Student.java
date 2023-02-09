package com.example.practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Student {

    @Id
    private Integer studentId;
    private String studentName;
    private Integer studentAge;

    public Integer getId() {
        return studentId;
    }

    public void setId(Integer id) {
        this.studentId = id;
    }

    public String getName() {
        return studentName;
    }

    public void setName(String name) {
        this.studentName = name;
    }

    public Integer getAge() {
        return studentAge;
    }

    public void setAge(Integer age) {
        this.studentAge = age;
    }

    public Student(Integer id, String name, Integer age) {
        this.studentId = id;
        this.studentName = name;
        this.studentAge = age;
    }
}
