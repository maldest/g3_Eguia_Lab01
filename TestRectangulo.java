package PyPooAct1;

public class TestRectangulo {
    public static void main(String[] args) {
        // Crear dos coordenadas para el rectángulo
        Coordenada c1 = new Coordenada(1, 2);
        Coordenada c2 = new Coordenada(4, 5);

        // Crear rectángulo con esas coordenadas
        Rectangulo r1 = new Rectangulo(c1, c2);

        // Mostrar información
        System.out.println("Rectángulo creado: " + r1);
        System.out.println("Área del rectángulo: " + r1.calculoArea());

        // Modificar una esquina
        r1.setEsquina1(new Coordenada(2, 3));
        System.out.println("Rectángulo modificado: " + r1);
    }
}
