package com.springbootproject.springbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController
{
    @GetMapping
    public List<String> findallcourses(){
        return List.of(
                "may",
                "tay"
        );
    }
}
