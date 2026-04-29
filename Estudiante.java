package Practico0_intento;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private Materia[] materias;
    private int cantidadMaterias;

    //Constructor sin parametros//
    public Estudiante (){
        materias = new Materia[10];
        cantidadMaterias = 0;
    }
    //Constructor con parametros//
    public Estudiante (String nombre, String apellido, int edad, String carrera, double promedio){
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setCarrera(carrera);
        setPromedio(promedio);
        materias = new Materia[10];
        cantidadMaterias = 0;
    }

    //Nombre get_set//
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre invalido");
        }
    }

    //Apellido get_set//
    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {
        if (apellido != null) {
            this.apellido = apellido;
        } else {
            System.out.println("Apellido invalido");
        }
    }

    //Edad get_set//
    public int getEdad() {return edad;}

    public void setEdad(int edad) {
        if (edad > 16) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida (debe ser mayor a 16)");
        }
    }

    //Carrera get_set//
    public String getCarrera() {return carrera;}

    public void setCarrera(String carrera) {this.carrera = carrera;}

    //Promedio get_set//
    public double getPromedio() {return promedio;}

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio invalido");
        }
    }

    //Agregar materias//
    public void agregarMateria(Materia materia){
        if(cantidadMaterias < materias.length){
            materias[cantidadMaterias] = materia;
            cantidadMaterias++;
        }
    }
    //Calcular promedios//
    public double calcularPromedio(){
        if(cantidadMaterias == 0){
            return 0;
        }
        double suma = 0;
        for(int i=0; i<cantidadMaterias; i++){
            suma += materias[i].getCalificacion();
        }
        return suma / cantidadMaterias;
    }
}
