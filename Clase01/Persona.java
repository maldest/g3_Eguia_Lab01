package Clase01;
//Clases es un modelo o plantilla define atributos y metodos 
public class Persona {
    String nombre;
    int edad;
    // Método para mostrar información
    void mostrarInfo() {
    System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
    //Método de instancia  
    // pertenece a un objeto en particular y operan sobre sus atributos 
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
    public void setNombre (String nombre) {
            this.nombre = nombre;
        }
     public void mostrarNombre() {
    System.out.println("Mi nombre es " + this.nombre);
         }
   
    }