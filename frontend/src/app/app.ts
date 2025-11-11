import { Component, signal, ViewChild } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EstudianteLista } from './components/estudiante-lista/estudiante-lista';
import { EstudianteFormulario } from './components/estudiante-formulario/estudiante-formulario';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, EstudianteLista, EstudianteFormulario],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('frontend');

  @ViewChild(EstudianteLista) lista!: EstudianteLista;

  onEstudianteCreado(): void {
    this.lista.cargarEstudiantes();
  }
}
