package prueba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Rectángulo 1:");
        Rectangulo rect1 = crearRectangulo(scanner);

        System.out.println("Rectángulo 2:");
        Rectangulo rect2 = crearRectangulo(scanner);

        double distancia = Verificador.distanciaEntre(rect1, rect2);
        String relacion = Verificador.seSobreponen(rect1, rect2) ? "Se sobreponen" : 
                          Verificador.estanJuntos(rect1, rect2) ? "Están juntos" : "Son disjuntos";

        System.out.println("\nResultados:");
        System.out.printf("%-10s %-25s %-10s %-10s %-15s%n", "Rectángulo", "Coordenadas", "Distancia", "Área", "Relación");
        System.out.printf("%-10d %-25s %-10.3f %-10.2f %-15s%n", 1, rect1, distancia, rect1.calcularArea(), relacion);
        System.out.printf("%-10d %-25s %-10.3f %-10.2f %-15s%n", 2, rect2, distancia, rect2.calcularArea(), ""); 

        scanner.close();
    }

        private static Rectangulo crearRectangulo(Scanner scanner) {
            System.out.println("Ingrese la primera esquina en formato x.y (ejemplo: -3.7,1.2):");
            String[] input1 = scanner.nextLine().trim().split(",");
            double x1 = Double.parseDouble(input1[0]);
            double y1 = Double.parseDouble(input1[1]);
        
            System.out.println("Ingrese la esquina opuesta en formato x.y (ejemplo: 7.5,-3.2):");
            String[] input2 = scanner.nextLine().trim().split(",");
            double x2 = Double.parseDouble(input2[0]);
            double y2 = Double.parseDouble(input2[1]);
        
            return new Rectangulo(x1, y1, x2, y2);
        }
    

    }

