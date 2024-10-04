package com.example.estudiantes.service;

import java.util.List;
import java.util.Optional;

import com.example.estudiantes.entity.Estudiante;

public interface EstudianteInterface {
	
	List<Estudiante> findAll();
	
	Optional<Estudiante> findById(Integer id);
	
	void post(Estudiante estudiante);
	
	void update(Estudiante estudiante);
	
	void deleteById(Integer id);
}
