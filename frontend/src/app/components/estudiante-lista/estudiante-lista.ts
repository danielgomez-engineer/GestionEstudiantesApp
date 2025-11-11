import { Component, OnInit } from '@angular/core';
import { EstudianteService, EstudianteDTO } from '../../services/estudiante';

@Component({
  selector: 'app-estudiante-lista',
  imports: [],
  templateUrl: './estudiante-lista.html',
  styleUrl: './estudiante-lista.css',
})
export class EstudianteLista implements OnInit {
  estudiantes: EstudianteDTO[] = [];

  constructor(private estudianteService: EstudianteService) {}

  ngOnInit(): void {
    this.cargarEstudiantes();
  }

  cargarEstudiantes(): void {
    this.estudianteService.obtenerEstudiantes().subscribe({
      next: (respuesta) => {
        if (respuesta.estadoHttp === 200) {
          this.estudiantes = respuesta.datos;
        }
      },
      error: (err) => console.error('Error al cargar estudiantes', err)
    });
  }

  eliminarEstudiante(id: number): void {
    this.estudianteService.eliminarEstudiante(id).subscribe({
      next: (respuesta) => {
        if (respuesta.estadoHttp === 200) {
          this.cargarEstudiantes(); // Refrescar lista
        }
      },
      error: (err) => console.error('Error al eliminar estudiante', err)
    });
  }
}
