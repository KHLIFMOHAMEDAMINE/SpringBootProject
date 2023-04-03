package com.springbootproject.springbootproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "course")
public class Course {

    @Id
    private String id;
    private String teacherID;
    private String name;
    private String URL;
    private String description;

}
