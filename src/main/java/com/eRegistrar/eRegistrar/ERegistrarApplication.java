package com.eRegistrar.eRegistrar;

import com.eRegistrar.eRegistrar.model.Student;
import com.eRegistrar.eRegistrar.service.StudentService;
import com.eRegistrar.eRegistrar.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ERegistrarApplication {

    public static void main(String[] args) {
		SpringApplication.run(ERegistrarApplication.class, args);
	}

}
