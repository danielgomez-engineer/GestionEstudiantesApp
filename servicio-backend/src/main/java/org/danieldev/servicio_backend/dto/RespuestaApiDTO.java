package org.danieldev.servicio_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespuestaApiDTO {
    private Object datos;
    private int estadoHttp;
    private String mensaje;
}