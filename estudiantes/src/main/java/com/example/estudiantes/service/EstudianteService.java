package com.example.estudiantes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estudiantes.entity.Estudiante;
import com.example.estudiantes.repository.EstudianteRepository;

@Service
public class EstudianteService implements EstudianteInterface {

	@Autowired
	private EstudianteRepository estudiante_repository;
	
	@Override
	public List<Estudiante> findAll(){
		return estudiante_repository.findAll();
	}
	
	public Optional<Estudiante> findById(Integer id){
		return estudiante_repository.findById(id);
	}
	
	public void post(Estudiante estudiante) {
		estudiante_repository.save(estudiante);
	}
	
	public void update(Estudiante estudiante) {
		estudiante_repository.save(estudiante);
	}
	
	public void deleteById(Integer id) {
		estudiante_repository.deleteById(id);
	}
	
}

