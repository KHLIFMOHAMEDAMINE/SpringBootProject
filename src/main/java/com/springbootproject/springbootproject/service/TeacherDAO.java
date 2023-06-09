package com.springbootproject.springbootproject.service;

import com.springbootproject.springbootproject.model.Course;
import com.springbootproject.springbootproject.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class TeacherDAO implements TeacherService
{
    @Autowired
    private TeacherRepository repository;

    @Override
    public Course save(Course course) {
        return repository.save(course);
    }

    @Override
    public List<Course> findallcourses() {
        return repository.findAll();
    }
}
