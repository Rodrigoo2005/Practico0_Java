# Practico0_Java
-Aplicacion del encapsulamiento: se declaro la mayoria de variables como 'private' y se implementaron los metodos 'getter' y 'setter'

-Relaciones entre clases: 
  Se crearon arreglos de objetos en sus respectivas clases y ciertos metodos para manejarlos
  *En Estudiante: 
    private Materia[] materias;
    agregarMateria(Materia materia)
    calcularPromedio()
  *En Carrera:  
    private Estudiante[] estudiantes;
    agregarEstudiante()
    listarEstudiantes()
    buscarEstudiante()
  *En universidad: private Estudiante[] estudiantes;
  
-Validaciones metodo setter:      
  *edad > 16
  *promedio >= 0 && promedio <= 10
  *nombre != null
  *apellido != null
