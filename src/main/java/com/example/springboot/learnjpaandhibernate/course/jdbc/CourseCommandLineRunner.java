package com.example.springboot.learnjpaandhibernate.course.jdbc;

import com.example.springboot.learnjpaandhibernate.course.bean.Course;
import com.example.springboot.learnjpaandhibernate.course.jpa.CourseJpaReporsitory;
import com.example.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    /*
    @Autowired
    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaReporsitory repository;
    */

    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        // jpa repository
        /*
        repository.insert(new Course(1,"Learn JAVA","Eyz"));
        repository.insert(new Course(2,"Learn AWS","Eyz"));
        repository.insert(new Course(3,"Learn React jpa","Eyz"));

        repository.deleteById(1);
        System.out.print(repository.findById(2));
        System.out.print(repository.findById(3));
        */
        repository.save(new Course(1,"Learn JAVA","Eyz"));
        repository.save(new Course(2,"Learn AWS","Eyz"));
        repository.save(new Course(3,"Learn React jpa","Eyz"));

        repository.deleteById(1l);
        System.out.print(repository.findById(2l));
        System.out.print(repository.findById(3l));
    }
}
