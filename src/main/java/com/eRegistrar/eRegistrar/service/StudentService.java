package com.eRegistrar.eRegistrar.service;

import com.eRegistrar.eRegistrar.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
    List<Student> searchStudents(String studentNumber);
}
