package PyPooAct1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PEDIR DATOS DEL PRIMER RECTÁNGULO
        System.out.println("Ingrese las coordenadas del primer rectángulo:");
        System.out.println("Ejemplo de como debes poner: 7.5 8.6");
        System.out.print("Ingrese una esquina 1 del 1er rectángulo (x y): ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.print("Ingrese la esquina 2 opuesta del 1er rectángulo (x y): ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();

        Rectangulo rectA = crearRectangulo(x1, y1, x2, y2);

        //  PEDIR DATOS DEL SEGUNDO RECTÁNGULO
        System.out.println("Ingrese las coordenadas del segundo rectángulo:");
        System.out.print("Ingrese una esquina 1 del 2do rectángulo (x y): ");
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();
        System.out.print("Ingrese una esquina 2 del 2do rectángulo (x y): ");
        double x4 = sc.nextDouble(), y4 = sc.nextDouble();

        Rectangulo rectB = crearRectangulo(x3, y3, x4, y4);

        // MOSTRAR INFORMACIÓN DE LOS RECTÁNGULOS
        System.out.println("Rectángulo A: " + rectA);
        System.out.println("Rectángulo B: " + rectB);

        // VERIFICAR RELACIÓN ENTRE LOS RECTÁNGULOS
        if (Verificador.seSobreponen(rectA, rectB)) {
            System.out.println("Los rectángulos A y B se sobreponen.");

            Rectangulo interseccion = rectanguloSobre(rectA, rectB);
            if (interseccion != null) {
                System.out.println("Área de sobreposición = " + interseccion.calculoArea());
            }
        } else if (Verificador.estanJuntos(rectA, rectB)) {
            System.out.println("Los rectángulos A y B están juntos.");
        } else {
            System.out.println("Los rectángulos A y B son disjuntos.");
        }

        sc.close(); // Cerrar Scanner
    }

    // Método para asegurar que la esquina 1 sea la inferior izquierda y la 2 la superior derecha
    public static Rectangulo crearRectangulo(double x1, double y1, double x2, double y2) {
        double menorX = Math.min(x1, x2);
        double menorY = Math.min(y1, y2);
        double mayorX = Math.max(x1, x2);
        double mayorY = Math.max(y1, y2);
        return new Rectangulo(new Coordenada(menorX, menorY), new Coordenada(mayorX, mayorY));
    }

    // Método para calcular el rectángulo de intersección si se sobreponen
    public static Rectangulo rectanguloSobre(Rectangulo a, Rectangulo b) {
        double x1 = Math.max(a.getEsquina1().getX(), b.getEsquina1().getX());
        double y1 = Math.max(a.getEsquina1().getY(), b.getEsquina1().getY());
        double x2 = Math.min(a.getEsquina2().getX(), b.getEsquina2().getX());
        double y2 = Math.min(a.getEsquina2().getY(), b.getEsquina2().getY());

        if (x1 >= x2 || y1 >= y2) {
            return null;
        }

        return new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
    }
}
