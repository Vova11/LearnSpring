package com.example.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {
    
    

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
            new Course(1L, "Learn Java", "Brad"),
            new Course(2L, "Learn Spring Boot", "Tom"),
            new Course(3L, "Learn AWS", "John")
        );

        


    }

}
