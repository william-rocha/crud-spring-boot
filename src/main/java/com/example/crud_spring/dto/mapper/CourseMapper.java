package com.example.crud_spring.dto.mapper;


import com.example.crud_spring.dto.CourseDTO;
import com.example.crud_spring.enums.Category;
import com.example.crud_spring.model.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {

    public CourseDTO toDTO(Course course) {
        if (course == null) {
            return null;
        }
//        mock para para o erro de compile
        return  new CourseDTO(course.getId(), course.getName(), "Front-end");
    }

    public Course toEntity(CourseDTO courseDTO) {

        if(courseDTO == null) {
            return null;
        }

        Course course = new Course();
        if(courseDTO.id() != null) {
            course.setId(courseDTO.id());
        }
        course.setName(courseDTO.name());
        course.setCategory(Category.FRONT_END);
        course.setStatus("Ativo");
        return  course;
    }
}
