package com.example.estudiantes.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.estudiantes.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {


}
