package com.eRegistrar.eRegistrar.repository;

import com.eRegistrar.eRegistrar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByStudentNumberContainingIgnoreCase(String studentNumber);
}
