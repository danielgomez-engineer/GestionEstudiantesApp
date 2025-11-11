# Gestión de Estudiantes

Esta es una aplicación simple para gestionar estudiantes. Permite agregar, listar y eliminar estudiantes a través de una interfaz web.

## Tecnologías Usadas

- **Backend**: Spring Boot 3.5.7 con Java 21
  - JPA/Hibernate para la base de datos
  - H2 Database (en memoria)
  - Lombok para reducir código boilerplate
- **Frontend**: Angular 20 con TypeScript
  - HttpClient para consumir la API
  - Componentes standalone

## Requisitos

- Java 21 (para el backend)
- Node.js y npm (para el frontend)
- Maven (viene incluido en el proyecto con mvnw)

## Instalación y Ejecución

### Backend
1. Ve a la carpeta `servicio-backend`.
2. Ejecuta `./mvnw spring-boot:run` (en Windows usa `mvnw.cmd spring-boot:run`).
3. El servidor se ejecutará en `http://localhost:8080`.

### Frontend
1. Ve a la carpeta `frontend`.
2. Instala dependencias: `npm install`.
3. Ejecuta `npm start`.
4. Abre el navegador en `http://localhost:4200`.

## Funcionalidades

- Agregar un nuevo estudiante (nombre, apellido, email).
- Listar todos los estudiantes en una tabla.
- Eliminar un estudiante.

## Estructura del Proyecto

```
GestionEstudiantesApp/
├── servicio-backend/     # Backend con Spring Boot
│   ├── src/
│   │   ├── main/java/org/danieldev/servicio_backend/
│   │   │   ├── ServicioBackendApplication.java
│   │   │   ├── controlador/
│   │   │   ├── dto/
│   │   │   ├── entity/
│   │   │   ├── mapeador/
│   │   │   ├── repository/
│   │   │   └── servicio/
│   │   └── resources/
│   └── pom.xml
└── frontend/             # Frontend con Angular
    ├── src/
    │   ├── app/
    │   │   ├── app.html
    │   │   ├── app.ts
    │   │   ├── services/
    │   │   └── components/
    │   └── styles.css
    └── package.json
```

## Notas

- La base de datos H2 se reinicia cada vez que se detiene el backend.
- Para producción, cambiar H2 por una base de datos persistente como PostgreSQL.

## Autor

Daniel Gómez - Proyecto para prueba técnica.