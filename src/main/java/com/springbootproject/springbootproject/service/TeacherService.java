package com.springbootproject.springbootproject.service;

import com.springbootproject.springbootproject.model.Course;

import java.util.List;

public interface TeacherService {
    Course save(Course course);
    List<Course> findallcourses();

}