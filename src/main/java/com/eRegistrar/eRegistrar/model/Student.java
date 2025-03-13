package com.eRegistrar.eRegistrar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(nullable = false, unique = true)
    private String studentNumber;

    @Column(nullable = false)
    private String FirstName;

    private String MiddleName;

    @Column(nullable = false)
    private String LastName;

    private Double cgpa;

    @Column(nullable = false)
    private LocalDate enrollmentDate;

    @Column(nullable = false)
    private String isInternational;

}
