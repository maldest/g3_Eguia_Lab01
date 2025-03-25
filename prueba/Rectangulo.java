package prueba;

public class Rectangulo {
    private int[][] esquinas;

    public Rectangulo(int[] esquina1, int[] esquina2) {
        //guarda las esquinas del rectángulo, calculando las dos que faltan
        esquinas = new int[4][2];
        esquinas[0] = esquina1;
        esquinas[1] = esquina2;
        esquinas[2] = new int[]{esquina1[0], esquina2[1]};
        esquinas[3] = new int[]{esquina2[0], esquina1[1]};
    }

    public void imprimirEsquinas() {
        //muestra las cuatro esquinas en el formato correcto
        for (int i = 0; i < 4; i++) {
            System.out.println("(" + esquinas[i][0] + ", " + esquinas[i][1] + ")");
        }
    }

    public int[] getEsquina1() {
        //retorna la esquina inferior izquierda (mínimos x e y)
        return new int[]{Math.min(esquinas[0][0], esquinas[1][0]), Math.min(esquinas[0][1], esquinas[1][1])};
    }

    public int[] getEsquina2() {
        //retorna la esquina superior derecha (máximos x e y)
        return new int[]{Math.max(esquinas[0][0], esquinas[1][0]), Math.max(esquinas[0][1], esquinas[1][1])};
    }

    public double calcularArea() {
        int base = Math.abs(getEsquina2()[0] - getEsquina1()[0]);
        int altura = Math.abs(getEsquina2()[1] - getEsquina1()[1]);
        return base * altura;
    }

    @Override
    public String toString() {
        return String.format("([%d, %d], [%d, %d])", getEsquina1()[0], getEsquina1()[1], getEsquina2()[0], getEsquina2()[1]);
    }
}

