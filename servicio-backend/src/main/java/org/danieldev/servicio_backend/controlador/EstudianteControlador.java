package org.danieldev.servicio_backend.controlador;

import org.danieldev.servicio_backend.dto.EstudianteCrearDTO;
import org.danieldev.servicio_backend.dto.RespuestaApiDTO;
import org.danieldev.servicio_backend.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio servicio;

    @GetMapping
    public ResponseEntity<RespuestaApiDTO> obtenerTodos() {
        return ResponseEntity.ok(new RespuestaApiDTO(servicio.obtenerTodos(), 200, "Estudiantes obtenidos"));
    }

    @PostMapping
    public ResponseEntity<RespuestaApiDTO> crear(@RequestBody EstudianteCrearDTO dto) {
        return ResponseEntity.status(201).body(new RespuestaApiDTO(servicio.crear(dto), 201, "Estudiante creado"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RespuestaApiDTO> eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
        return ResponseEntity.ok(new RespuestaApiDTO(null, 200, "Estudiante eliminado"));
    }
}
