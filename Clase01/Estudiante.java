package Clase01;

public class Estudiante {
    private String nombre;
    private int edad;

 public Estudiante (String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
}
public void mostrar () {
 System.out.println("Estudiante: " + this.nombre + ", Edad:" + this.edad);
}
}
