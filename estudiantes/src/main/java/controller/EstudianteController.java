package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Estudiante;
import service.EstudianteInterface;

@RestController
public class EstudianteController {

	@Autowired
	EstudianteInterface estudiante_interface;
	
	@GetMapping("/estudiantes")
	public List<Estudiante> getEstudiantes(){
		return estudiante_interface.findAll();
	}
	
	@GetMapping("/estudiante")
	public Optional<Estudiante> getEstudiante(Integer id) {
		return estudiante_interface.findById(id);
	}
	
	@PostMapping("/estudiante")
	public void postEstudiante(Estudiante estudiante) {
		estudiante_interface.post(estudiante);
	}
	
	@PutMapping("/estudiante")
	public void putEstudiante(Estudiante estudiante) {
		estudiante_interface.update(estudiante);
	}
	
	@DeleteMapping("/estudiante")
	public void deteleEstudiante(Integer id) {
		estudiante_interface.deleteById(id);
	}
}
