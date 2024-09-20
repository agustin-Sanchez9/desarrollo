package entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "legajo")
	private Integer legajo;
	
	@Column(name = "nombre")
	private String nombre;
	 
	@Column(name = "dni")
	private Integer dni;
	
	@Column(name = "fecha_nac")
	private Date fecha_nac;
	
	@Column(name = "fecha_ingreso")
	private Date fecha_ingreso;
	
	@Column(name = "direccion")
	private String direcccion;
	
	// Getters and Setters
}
