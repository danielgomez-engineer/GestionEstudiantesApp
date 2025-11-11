package org.danieldev.servicio_backend.servicio;

import org.danieldev.servicio_backend.dto.EstudianteCrearDTO;
import org.danieldev.servicio_backend.dto.EstudianteDTO;
import org.danieldev.servicio_backend.mapeador.EstudianteMapeador;
import org.danieldev.servicio_backend.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstudianteServicio {

    @Autowired private EstudianteRepository repositorio;
    @Autowired
    private EstudianteMapeador mapeador;

    public List<EstudianteDTO> obtenerTodos() {
        return repositorio.findAll().stream().map(mapeador::aDTO).collect(Collectors.toList());
    }
    public EstudianteDTO crear(EstudianteCrearDTO dto) {
        return mapeador.aDTO(repositorio.save(mapeador.aEntidad(dto)));
    }
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}
