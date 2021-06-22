package com.streetstate.courseregistration.dao.repository;

import com.streetstate.courseregistration.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {
    public Optional<Course> findCourseByCourseName(String courseName);

}
