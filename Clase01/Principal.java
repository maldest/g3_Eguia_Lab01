package Clase01;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Utilidades u1 = new Utilidades();
        Estudiante[] grupo = new Estudiante[3];
        p1.nombre = "Raul";
        p1.edad = 22;
        p1.mostrarInfo();
        p1.nombre = "Andre";
        p1.saludar(); // Salida: Hola, mi nombre es Carlos
        Utilidades.mostrarMensaje("Bienvenidos al curso!!!!");
        u1.asignarNombre("Algoritmo");
        u1.mostrarNombre(); // Salida: Nombre del curso algoritmo
        grupo[0] = new Estudiante("Ana", 20);
        grupo[1] = new Estudiante("Pedro", 22);
        grupo[2] = new Estudiante("Luis", 19);
        for (Estudiante e : grupo) {
            e.mostrar();
        }
       }
    }
