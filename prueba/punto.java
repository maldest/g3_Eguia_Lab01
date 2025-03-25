package prueba;

import java.util.Scanner;

class Cuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la primera esquina en formato "x y"
        double[] esquina1 = leerEsquina(scanner, "Ingrese la primera esquina en formato x y (por ejemplo, 1.5 3.0):");

        // Leer la esquina opuesta
        double[] esquina2 = leerEsquina(scanner, "Ingrese la esquina opuesta en formato x y (por ejemplo, 5.5 1.5):");

        // Extraer coordenadas
        double x1 = esquina1[0], y1 = esquina1[1];
        double x2 = esquina2[0], y2 = esquina2[1];

        // Calcular las otras dos esquinas
        double x3 = x1, y3 = y2;
        double x4 = x2, y4 = y1;

        // Imprimir las esquinas del cuadrado
        System.out.println("\nLas cuatro esquinas del cuadrado son:");
        System.out.println("(" + x1 + ", " + y1 + ")");
        System.out.println("(" + x2 + ", " + y2 + ")");
        System.out.println("(" + x3 + ", " + y3 + ")");
        System.out.println("(" + x4 + ", " + y4 + ")");

        scanner.close();
    }

    // Método para leer una esquina completa en un solo input
    public static double[] leerEsquina(Scanner scanner, String mensaje) {
        double[] coordenadas = new double[2];
        boolean valido = false;

        while (!valido) {
            System.out.println(mensaje);
            String entrada = scanner.nextLine().trim();
            String[] partes = entrada.split("[, ]+"); // Divide por espacio o coma

            if (partes.length == 2) {
                try {
                    coordenadas[0] = Double.parseDouble(partes[0]); // x
                    coordenadas[1] = Double.parseDouble(partes[1]); // y
                    valido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese dos números separados por espacio o coma.");
                }
            } else {
                System.out.println("Error: Formato incorrecto. Ejemplo válido: 1.5 3.0");
            }
        }

        return coordenadas;
    }
}
