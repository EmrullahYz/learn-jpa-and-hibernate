package com.example.springboot.learnjpaandhibernate.course.jdbc;

import com.example.springboot.learnjpaandhibernate.course.bean.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn JAVA","Eyz"));
        repository.insert(new Course(2,"Learn AWS","Eyz"));
        repository.insert(new Course(3,"Learn React","Eyz"));

        repository.deleteById(1);
        System.out.print(repository.findById(2));
        System.out.print(repository.findById(3));
    }
}
