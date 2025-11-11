package org.danieldev.servicio_backend.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstudianteCrearDTO {


    private String nombre;
    private String email;
    private int edad;
}
