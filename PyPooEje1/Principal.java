package PyPooEje1;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContainerRect contenedor = new ContainerRect(10); // Almacenar hasta 10 rectángulos

        for (int i = 0; i < 2; i++) { // Se piden 2 rectángulos
            System.out.println("Ingrese las coordenadas del rectángulo " + (i + 1) + ":");
            System.out.print("Esquina 1 (x y): ");
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            System.out.print("Esquina 2 (x y): ");
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();

            Rectangulo rect = crearRectangulo(x1, y1, x2, y2);
            contenedor.addRectangulo(rect);
        }

        System.out.println(" Rectángulos almacenados:");
        System.out.println(contenedor);

        sc.close();
    }

    public static Rectangulo crearRectangulo(double x1, double y1, double x2, double y2) {
        double menorX = Math.min(x1, x2);
        double menorY = Math.min(y1, y2);
        double mayorX = Math.max(x1, x2);
        double mayorY = Math.max(y1, y2);
        return new Rectangulo(new Coordenada(menorX, menorY), new Coordenada(mayorX, mayorY));
    }
}
