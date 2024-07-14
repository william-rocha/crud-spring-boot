package com.example.crud_spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@table(name = "cursos")
public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @JsonProperty("_id")
//        @JsonIgnore
        private Long id;

        @Column(length = 200, nullable = false)
        private String name;

        @Column(length = 10, nullable = false)
        private String category;

}
