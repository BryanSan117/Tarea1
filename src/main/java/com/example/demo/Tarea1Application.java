package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Tarea1Application implements CommandLineRunner {

	@Autowired
	private Alumno_Repositorio AlumnoRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea1Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		List<Alumno>Alumno = AlumnoRepo.findAll();
		
		Alumno.forEach(System.out :: println);
	
		
		System.exit(0);
	}

}