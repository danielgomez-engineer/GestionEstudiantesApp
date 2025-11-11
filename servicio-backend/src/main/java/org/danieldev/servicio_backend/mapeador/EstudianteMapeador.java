package org.danieldev.servicio_backend.mapeador;


import org.danieldev.servicio_backend.dto.EstudianteCrearDTO;
import org.danieldev.servicio_backend.dto.EstudianteDTO;
import org.danieldev.servicio_backend.entity.Estudiante;
import org.springframework.stereotype.Component;

@Component
public class EstudianteMapeador {

    public EstudianteDTO aDTO(Estudiante estudiante) {
        return new EstudianteDTO(estudiante.getId(), estudiante.getNombre(), estudiante.getEmail(), estudiante.getEdad());
    }
    public Estudiante aEntidad(EstudianteCrearDTO dto) {
        return new Estudiante(null, dto.getNombre(), dto.getEmail(), dto.getEdad());
    }
}
