package com.example.crud_spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


@Data
@Entity
//@table(name = "cursos")
public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @JsonProperty("_id")
//        @JsonIgnore
        private Long id;

//        como no banco foi 100
        @NotBlank
        @NotNull
        @Length(min = 5, max = 30)
        @Column(length = 100, nullable = false)
        private String name;

        @NotNull
        @Length(max = 10)
        @Pattern(regexp = "Back-end|Front-end")
        @Column(length = 10, nullable = false)
        private String category;

}
