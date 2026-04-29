package Practico0_intento;

public class Carrera {

    private String nombre;
    private Estudiante[] estudiantes;
    private int cantidad;


    //GET estudiante//
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }   

    //Constructor//
    public Carrera(String nombre){
        this.nombre = nombre;
        estudiantes = new Estudiante[20];
        cantidad = 0;
    }

    //Agregar estudiante//
    public void agregarEstudiante(Estudiante e){
        if(cantidad < estudiantes.length){
            estudiantes[cantidad] = e;
            cantidad++;
        }
    }

    //Listar estudiantes//
    public void listarEstudiantes(){
        for(int contador=0; contador<cantidad; contador++){
            System.out.println("-" + estudiantes[contador].getApellido() + ", " + estudiantes[contador].getNombre());
        }
    }

    //Buscar estudiante//
    public void buscarEstudiante(String nombre){
        for(int contador=0; contador<cantidad; contador++){
            if(estudiantes[contador].getNombre().equals(nombre)){
                System.out.println("Estudiante encontrado:\n\tNombre: " + estudiantes[contador].getNombre());
                return;
            }
        }
        System.out.println("No encontrado");
    }
}