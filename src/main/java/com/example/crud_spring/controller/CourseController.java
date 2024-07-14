package com.example.crud_spring.controller;

import com.example.crud_spring.model.Course;
import com.example.crud_spring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/courses")
@AllArgsConstructor
public class CourseController {

//    @Autowired
//@AllArgsConstructor gerou o constructor por debaixo dos panos
    private final CourseRepository courseRepository;

//  generate => controller  public CourseController(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//    }

    @GetMapping
    public List<Course> list() {
//        list<Object>
//            return null;
        return courseRepository.findAll();
    };
}
