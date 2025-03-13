package com.eRegistrar.eRegistrar.service.impl;

import com.eRegistrar.eRegistrar.model.Student;
import com.eRegistrar.eRegistrar.repository.StudentRepository;
import com.eRegistrar.eRegistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        Student student1 = getStudentById(student.getStudentId());
        student1.setStudentNumber(student.getStudentNumber());
        student1.setCgpa(student.getCgpa());
        student1.setFirstName(student.getFirstName());
        student1.setMiddleName(student.getMiddleName());
        student1.setLastName(student.getLastName());
        student1.setIsInternational(student.getIsInternational());
        student1.setEnrollmentDate(student.getEnrollmentDate());
        return studentRepository.save(student1);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> searchStudents(String query) {
        return studentRepository.findByStudentNumberContainingIgnoreCase(query);
    }

}
