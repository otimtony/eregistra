package com.eRegistrar.eRegistrar.controller;

import com.eRegistrar.eRegistrar.model.Student;
import com.eRegistrar.eRegistrar.service.StudentService;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students/students";
    }

    @GetMapping("/new")
    public String showFormCreateStudent(Model model){
        model.addAttribute("student", new Student());
        return "students/new-student-form";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "students/edit-student-form";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student){
        studentService.updateStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

    @GetMapping("/search")
    public String searchForStudents(@RequestParam("query") String query, Model model){
        List<Student> searchResults = studentService.searchStudents(query);
        model.addAttribute("students", searchResults);
        return "students/students";
    }

}
