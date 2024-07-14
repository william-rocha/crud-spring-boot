package com.example.crud_spring.controller;

import com.example.crud_spring.model.Course;
import com.example.crud_spring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    };

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        return courseRepository.save(course);
    }


//    @PostMapping
//    public ResponseEntity<Course> create(@RequestBody Course course) {
////        created 201
//        return ResponseEntity.status(HttpStatus.CREATED).body(courseRepository.save(course));
//    }

//    @PostMapping
////    public void create(@RequestBody Course course) {
//    public Course create(@RequestBody Course course) {
////        System.out.println(course.getName());
//       return courseRepository.save(course); success 200
//    }
}
