package repository;


import org.springframework.data.jpa.repository.JpaRepository;

import entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {


}
