package com.example.learn_spring_boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private long id;
    private String name;
    private String student;
    private List<Course> courses = new ArrayList<>();
    
    
    public Course() {}
    
    public Course(long id, String name, String student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStudent() {
        return student;
    }

    

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", student=" + student + "]";
    }

}
