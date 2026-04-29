package Practico0_intento;

public class Materia {
    private String nombre;
    private String codigo;
    private int credito;
    private double calificacion;

    //Constructor//
    public Materia(String nombre, String codigo, int credito, double calificacion){
        this.nombre = nombre;
        this.codigo = codigo;
        this.credito = credito;
        this.calificacion = calificacion;
    }
    //GETS//
    public String getNombre() {return nombre;}
    public String getCodigo() {return codigo;}
    public int getCredito() {return credito;}
    public double getCalificacion() {return calificacion;}
    //SETS//
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public void setCredito(int credito) {this.credito = credito;}
    public void setCalificacion(double calificacion) {this.calificacion = calificacion;}
}
