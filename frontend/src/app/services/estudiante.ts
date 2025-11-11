import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface EstudianteDTO {
  id: number;
  nombre: string;
  email: string;
  edad: number;
}

export interface EstudianteCrearDTO {
  nombre: string;
  email: string;
  edad: number;
}

export interface RespuestaApiDTO {
  datos: any;
  estadoHttp: number;
  mensaje: string;
}

@Injectable({
  providedIn: 'root',
})
export class EstudianteService {
  private apiUrl = 'http://localhost:8080/api/estudiantes';

  constructor(private http: HttpClient) {}

  obtenerEstudiantes(): Observable<RespuestaApiDTO> {
    return this.http.get<RespuestaApiDTO>(this.apiUrl);
  }

  crearEstudiante(dto: EstudianteCrearDTO): Observable<RespuestaApiDTO> {
    return this.http.post<RespuestaApiDTO>(this.apiUrl, dto);
  }

  eliminarEstudiante(id: number): Observable<RespuestaApiDTO> {
    return this.http.delete<RespuestaApiDTO>(`${this.apiUrl}/${id}`);
  }
}
