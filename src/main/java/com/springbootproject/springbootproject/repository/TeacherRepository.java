package com.springbootproject.springbootproject.repository;

import com.springbootproject.springbootproject.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends MongoRepository<Course,String> {

}
