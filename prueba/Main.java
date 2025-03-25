package prueba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad máxima de rectángulos a almacenar:");
        int capacidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        ContainerRect contenedor = new ContainerRect(capacidad);

        for (int i = 0; i < capacidad; i++) {
            System.out.println("\n🔷 Rectángulo " + (i + 1) + ":");
            Rectangulo rect = obtenerRectangulo(scanner);
            contenedor.addRectangulo(rect);
        }

        System.out.println("\n📊 Resultados:");
        System.out.println(contenedor);

        scanner.close();
    }

    public static Rectangulo obtenerRectangulo(Scanner scanner) {
        int[] esquina1 = leerEsquina(scanner, "Ingrese la primera esquina en formato x.y (ejemplo: -3.7):");
        int[] esquina2 = leerEsquina(scanner, "Ingrese la esquina opuesta en formato x.y (ejemplo: 7.-3):");

        return new Rectangulo(esquina1, esquina2);
    }

    public static int[] leerEsquina(Scanner scanner, String mensaje) {
        int[] coordenadas = new int[2];
        boolean valido = false;

        while (!valido) {
            System.out.println(mensaje);
            String entrada = scanner.nextLine().trim();

            if (entrada.matches("-?\\d+\\.-?\\d+")) {
                String[] partes = entrada.split("\\.");
                coordenadas[0] = Integer.parseInt(partes[0]);
                coordenadas[1] = Integer.parseInt(partes[1]);
                valido = true;
            } else {
                System.out.println("❌ Formato incorrecto. Debe ser dos números enteros separados por un punto (ejemplo: -3.7).");
            }
        }

        return coordenadas;
    }
}
