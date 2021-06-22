package com.streetstate.courseregistration.dao.repository;

import com.streetstate.courseregistration.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
