package com.springbootproject.springbootproject.controller;

import com.springbootproject.springbootproject.model.Course;
import com.springbootproject.springbootproject.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController
{
    private TeacherService service;

    @Autowired
    public TeacherController(TeacherService service) {
        this.service = service;
    }

    @GetMapping
    public List<Course> findallcourses(){
        return service.findallcourses();
    }
}
