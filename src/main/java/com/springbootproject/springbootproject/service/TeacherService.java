package com.springbootproject.springbootproject.service;

import com.springbootproject.springbootproject.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    public List<Course> findallcourses(){
        return List.of(
                new Course(
                        "hmmhh",
                        "gfd",
                        "eee"
                )
        );
    }

}