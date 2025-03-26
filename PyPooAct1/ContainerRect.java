package PyPooEje1;


public class ContainerRect {
    private Rectangulo[] rectangulos;  // Almacenamos los rectángulos
    private double[] distancias;       // Almacenamos las distancias euclidianas
    private double[] areas;            // Almacenamos las áreas
    private int n;                      // Capacidad máxima del contenedor
    private static int numRec = 0;      // Cantidad de rectángulos almacenados

    // Constructor-> recibe la cantidad máxima de rectángulos
    public ContainerRect(int capacidad) {
        this.n = capacidad;
        this.rectangulos = new Rectangulo[n];
        this.distancias = new double[n];
        this.areas = new double[n];
    }

    // Método para agregar un rectángulo al contenedor
    public void addRectangulo(Rectangulo r) {
        if (numRec < n) {
            rectangulos[numRec] = r;
            distancias[numRec] = calcularDistancia(r);
            areas[numRec] = r.calculoArea();
            numRec++;
        } else {
            System.out.println("¡ No se puede agregar más rectángulos. Capacidad máxima alcanzada >:c !");
        }
    }

    // Método para calcular la distancia EUCLIDIANA de un rectángulo
    private double calcularDistancia(Rectangulo r) {
        double dx = r.getEsquina1().getX() - r.getEsquina2().getX();
        double dy = r.getEsquina1().getY() - r.getEsquina2().getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método para mostrar los rectángulos almacenados
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectángulo\tCoordenadas\t\tDistancia\tÁrea\n");
        for (int i = 0; i < numRec; i++) {
            sb.append((i + 1) + "\t" + rectangulos[i] + "\t" + String.format("%.3f", distancias[i]) + "\t" + String.format("%.2f", areas[i]) + "\n");
        }
        return sb.toString();
    }
}
