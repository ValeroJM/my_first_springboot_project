package com.myfirst.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/*
The Goal is to get a response this JSON object information
when we run our localHost 8080
//http://localhost:8080/courses
[
    {
    "id": 1,
    "name": "learn AWS",
    "author": "in28minutes"
    }
]
 */

//1. We use @RestController annotation
@RestController
public class CourseController {
//2. Our goal is to retrieve a set of Courses
//Each course will have --> Course: id, name, author
//3. We need to create a class "Course" so we can instantiate the object from

//4. We want to retrieve the courses information when we use http://localhost:8080/courses
    //4.1 To do that we use @RequestMapping annotation on top of our method
    //4.2 Define next to the @RequestMapping annotation the folder like below. Example: @RequestMapping("/courses")
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn DevOps", "in28minutes")
        );
    }

//5. Now to run it we need to run LearnSpringBootApplication class
//6. Navigate to http://localhost:8080/courses
//7. It will display the Courses in a JSON format

}
