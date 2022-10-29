package com.r2g.springredisstudent.repository;

import com.r2g.springredisstudent.domain.Student;

import java.util.Map;

public interface RedisRepository {
    Map<String, Student> findAll();

    Student findById(String id);

    void save(Student student);

    void delete(String id);

}
