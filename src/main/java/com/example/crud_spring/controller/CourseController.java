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

    @GetMapping("/{id}")
    ResponseEntity<Course> findById(@PathVariable Long id) {
//        se não achar retorna 404
        return courseRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

//    retorna Optional
//  @GetMapping("/{id}")
//   public Course findById(@PathVariable Long id) {
//    return courseRepository.findById(id);
//}

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        return courseRepository.save(course);
    }
}
