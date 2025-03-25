package prueba;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pedimos los datos del primer rectángulo
        System.out.println("Primer rectángulo:");
        Rectangulo rectangulo1 = obtenerRectangulo(scanner);

        //pedimos los datos del segundo rectángulo
        System.out.println("\nSegundo rectángulo:");
        Rectangulo rectangulo2 = obtenerRectangulo(scanner);

        //mostramos las esquinas de cada rectángulo
        System.out.println("\nEsquinas del primer rectángulo:");
        rectangulo1.imprimirEsquinas();

        System.out.println("\nEsquinas del segundo rectángulo:");
        rectangulo2.imprimirEsquinas();

        //verificamos la relación entre los rectángulos
        System.out.println("\n📊 Resultados:");
        if (Verificador.seSobreponen(rectangulo1, rectangulo2)) {
            System.out.println("✅ Los rectángulos se sobreponen.");
        } else if (Verificador.estanJuntos(rectangulo1, rectangulo2)) {
            System.out.println("🔄 Los rectángulos están juntos pero no se sobreponen.");
        } else {
            double distancia = Verificador.distanciaEntre(rectangulo1, rectangulo2);
            System.out.println("❌ Los rectángulos son disjuntos y están separados por una distancia de: " + distancia);
        }

        scanner.close();
    }

    public static Rectangulo obtenerRectangulo(Scanner scanner) {
        //pedimos dos esquinas opuestas al usuario
        int[] esquina1 = leerEsquina(scanner, "Ingrese la primera esquina en formato x.y (ejemplo: 3.7):");
        int[] esquina2 = leerEsquina(scanner, "Ingrese la esquina opuesta en formato x.y (ejemplo: 7.3):");

        //creamos un rectángulo con esas esquinas
        return new Rectangulo(esquina1, esquina2);
    }

    public static int[] leerEsquina(Scanner scanner, String mensaje) {
        int[] coordenadas = new int[2];
        boolean valido = false;

        while (!valido) {
            System.out.println(mensaje);
            String entrada = scanner.nextLine().trim();

            //validamos que el formato sea correcto antes de procesarlo
            /*Numeros enteros positivos
            if (entrada.matches("\\d+\\.\\d+")){} 
            */
            if (entrada.matches("-?\\d+\\.-?\\d+")){
                String[] partes = entrada.split("\\.");
                coordenadas[0] = Integer.parseInt(partes[0]);
                coordenadas[1] = Integer.parseInt(partes[1]);
                valido = true;
            } else {
                System.out.println("Error: formato incorrecto. debe ser dos números enteros separados por un punto (ejemplo: 3.7).");
            }
        }

        return coordenadas;
    }
}
