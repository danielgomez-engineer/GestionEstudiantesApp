import { Component, Output, EventEmitter } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { EstudianteService, EstudianteCrearDTO } from '../../services/estudiante';

@Component({
  selector: 'app-estudiante-formulario',
  imports: [FormsModule],
  templateUrl: './estudiante-formulario.html',
  styleUrl: './estudiante-formulario.css',
})
export class EstudianteFormulario {
  @Output() estudianteCreado = new EventEmitter<void>();

  estudiante: EstudianteCrearDTO = {
    nombre: '',
    email: '',
    edad: 0
  };

  constructor(private estudianteService: EstudianteService) {}

  crearEstudiante(): void {
    this.estudianteService.crearEstudiante(this.estudiante).subscribe({
      next: (respuesta) => {
        if (respuesta.estadoHttp === 201) {
          this.estudianteCreado.emit(); // Emitir evento para refrescar lista
          this.estudiante = { nombre: '', email: '', edad: 0 }; // Limpiar form
        }
      },
      error: (err) => console.error('Error al crear estudiante', err)
    });
  }
}
