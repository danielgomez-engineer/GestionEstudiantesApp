package org.danieldev.servicio_backend.repository;

import org.danieldev.servicio_backend.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    @Query("SELECT e.id as id, e.nombre as nombre, e.email as email FROM Estudiante e")
    List<EstudianteProyeccion> encontrarTodosProyectados();
}
