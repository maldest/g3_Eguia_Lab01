package prueba;

public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int capacidad;
    private int numRec;

    public ContainerRect(int capacidad) {
        this.capacidad = capacidad;
        this.numRec = 0;
        this.rectangulos = new Rectangulo[capacidad];
        this.distancias = new double[capacidad];
        this.areas = new double[capacidad];
    }

    public boolean addRectangulo(Rectangulo r) {
        if (numRec >= capacidad) {
            System.out.println("❌ No se pueden agregar más rectángulos.");
            return false;
        }

        rectangulos[numRec] = r;
        distancias[numRec] = calcularDistancia(r);
        areas[numRec] = r.calcularArea();
        numRec++;
        return true;
    }

    private double calcularDistancia(Rectangulo r) {
        int[] esquina1 = r.getEsquina1();
        int[] esquina2 = r.getEsquina2();
        return Math.sqrt(Math.pow(esquina2[0] - esquina1[0], 2) + Math.pow(esquina2[1] - esquina1[1], 2));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Rectángulos:\n");
        sb.append("Rectángulo  Coordenadas             Distancia   Área\n");
        for (int i = 0; i < numRec; i++) {
            sb.append(String.format("%-10d %-25s %-10.3f %-10.2f\n",
                    (i + 1), rectangulos[i].toString(), distancias[i], areas[i]));
        }
        return sb.toString();
    }
}
