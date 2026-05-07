package Practico0_intento;

public class Main {
    public static void main(String[] args){
        
        //Constructor sin parametros//
        Estudiante e1= new Estudiante ();
        e1.setNombre("Felipe");
        e1.setApellido ("Gonzalez");
        e1.setEdad (22);
        e1.setCarrera ("Enfermeria");
        e1.setPromedio (8);

        //Constructor con parametros//
        Estudiante e2= new Estudiante ("Mateo", "Rodriguez", 19, "Marketing", 7);
        Estudiante e3= new Estudiante ("Benjamin","Gomez", 20, "Enfermeria", 9);

        //Arreglo estudiantes//
        Estudiante[] listaEstudiantes = {e1, e2, e3};

        //Mostrar arreglo//
        System.out.println("\t\tMOSTRAR LISTADO INICIAL");
        for (int contador=0 ; contador<listaEstudiantes.length ; contador++){
            System.out.println ("-Estudiante [" + (contador+1) + "]:");
            System.out.println ("\tNombre: " + listaEstudiantes[contador].getNombre());
            System.out.println ("\tPromedio: " + listaEstudiantes[contador].getPromedio());
        }

        //Creacion de carrera//
        Carrera c1 = new Carrera("Ingenieria");

        //Creacion de estudiantes en carrera//
        c1.agregarEstudiante(e1);
        c1.agregarEstudiante(e2);
        c1.agregarEstudiante(e3);

        //Creacion de materias y asignacion a estudiantes//
        Materia m1 = new Materia("Matematica","MAT2026",5,8);
        Materia m2 = new Materia("Programacion","PRO2026",6,9);
        Materia m3 = new Materia("Fisica","FIS2026",5,5);
        Materia m4 = new Materia("Quimica","QUI2026",6,10);
        Materia m5 = new Materia("Algebra","ALG2026",5,7);
        Materia m6 = new Materia("Historia","HIS2026",6,6);
        e1.agregarMateria(m1);
        e1.agregarMateria(m2);
        e2.agregarMateria(m3);
        e2.agregarMateria(m4);
        e3.agregarMateria(m5);
        e3.agregarMateria(m6);

        //Calculo de promedio//
        System.out.println ("\t\tPROMEDIO DE CADA ESTUDIANTE:");
        System.out.println ("-Nombre: " + c1.getEstudiantes()[0].getNombre() + "\nPromedio: " + c1.getEstudiantes()[0].calcularPromedio());
        System.out.println ("-Nombre: " + c1.getEstudiantes()[1].getNombre() + "\nPromedio: " + c1.getEstudiantes()[1].calcularPromedio());
        System.out.println ("-Nombre: " + c1.getEstudiantes()[2].getNombre() + "\nPromedio: " + c1.getEstudiantes()[2].calcularPromedio());

        //Listado de estudiantes de la carrera//
        System.out.println("\t\tLISTADO DE ESTUDIANTES EN LA CARRERA:");
        c1.listarEstudiantes();
        System.out.println("\t\tBUSQUEDA DE ESTUDIANTE (Mateo):");
        c1.buscarEstudiante("Mateo");
    }
}
