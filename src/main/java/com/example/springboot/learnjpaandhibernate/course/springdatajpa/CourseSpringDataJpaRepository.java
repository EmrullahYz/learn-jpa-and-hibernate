package com.example.springboot.learnjpaandhibernate.course.springdatajpa;

import com.example.springboot.learnjpaandhibernate.course.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
