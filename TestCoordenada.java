package PyPooAct1;

import java.util.Scanner;

public class TestCoordenada {
    public static void main(String[] args) {
        // Crear coordenadas con diferentes constructores
        //Constructor sin parametros 
        Coordenada c1 = new Coordenada();         // (0,0)
        //Constructor con parametros 
        Coordenada c2 = new Coordenada(5, 4);     // (5,4)
        // Constructor copia
        Coordenada c3 = new Coordenada(c2);      // (5,4) copiado de c2
        //Insertar datos manualmente 
        Scanner sc = new Scanner(System.in); // Creamos el Scanner


        // Mostrar coordenadas
        System.out.println("Coordenada 1: " + c1);
        System.out.println("Coordenada 2: " + c2);
        System.out.println("Coordenada 3 (copia de c2): " + c3);

        //Modificamos valores 
        c2.setX(6);  // Ahora la coordenada es (6,4)
        System.out.println("Coordenada 2 modificada: " + c2);


        // Calcular distancias
        System.out.println("Distancia entre c1 y c2: " + c1.distancia(c2));
        System.out.println("Distancia entre c2 y c3: " + Coordenada.distancia(c2, c3));
        
        // Pedir al usuario que ingrese los valores de x e y
         System.out.print("Ingresa el valor de x: ");
         double x = sc.nextDouble();
         System.out.print("Ingresa el valor de y: ");
         double y = sc.nextDouble();
 
         // Crear la coordenada con los valores ingresados
         Coordenada c = new Coordenada(x, y);
 
         // Mostrar la coordenada creada
         System.out.println("Tu coordenada inscrita  es:" + c);

        sc.close();
    
    }
}
