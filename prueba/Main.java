package prueba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContainerRect container = new ContainerRect(5); // Capacidad de 5 rectángulos

        System.out.println("Rectángulo 1:");
        Rectangulo rect1 = crearRectangulo(scanner);
        container.addRectangulo(rect1);

        System.out.println("Rectángulo 2:");
        Rectangulo rect2 = crearRectangulo(scanner);
        container.addRectangulo(rect2);

        System.out.println("\nResultados:");
        System.out.println(container); // Imprime los rectángulos almacenados en el container

        scanner.close();
    }

    private static Rectangulo crearRectangulo(Scanner scanner) {
        System.out.println("Ingrese la primera esquina en formato x.y (ejemplo: -3.7,1.2):");
        String[] input1 = scanner.next().split(",");
        double x1 = Double.parseDouble(input1[0]);
        double y1 = Double.parseDouble(input1[1]);

        System.out.println("Ingrese la esquina opuesta en formato x.y (ejemplo: 7.5,-3.2):");
        String[] input2 = scanner.next().split(",");
        double x2 = Double.parseDouble(input2[0]);
        double y2 = Double.parseDouble(input2[1]);

        return new Rectangulo(x1, y1, x2, y2);
    }
}

