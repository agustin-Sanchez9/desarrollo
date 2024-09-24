package com.example.estudiantes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.estudiantes.entity.Estudiante;
import com.example.estudiantes.service.EstudianteInterface;

@RestController
public class EstudianteController {

	@Autowired
	EstudianteInterface estudiante_interface;
	
	@GetMapping("/estudiantes")
	public List<Estudiante> getEstudiantes(){
		return estudiante_interface.findAll();
	}
	
	@GetMapping("/estudiante")
	public Optional<Estudiante> getEstudiante(@RequestParam Integer id) {
		return estudiante_interface.findById(id);
	}
	
	@PostMapping("/estudiante")
	public void postEstudiante(@RequestBody Estudiante estudiante) {
		estudiante_interface.post(estudiante);
	}
	
	@PutMapping("/estudiante")
	public void putEstudiante(@RequestBody Estudiante estudiante) {
		estudiante_interface.update(estudiante);
	}
	
	@DeleteMapping("/estudiante")
	public void deteleEstudiante(@RequestParam Integer id) {
		estudiante_interface.deleteById(id);
	}
}
