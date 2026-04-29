package Practico0_intento;

public class Universidad {
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;

    //GETS//
    public String getNombre() {return nombre;}
    public String getDireccion() {return direccion;}
    public Estudiante[] getEstudiantes() {return estudiantes;}
    
    //SETS//
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public void setEstudiantes(Estudiante[] estudiantes) {this.estudiantes = estudiantes;}
}
