package prueba;

public class Rectangulo {
    private int[][] esquinas;

    public Rectangulo(int[] esquina1, int[] esquina2) {
        //guardamos las esquinas del rectángulo, calculando las dos que faltan
        esquinas = new int[4][2];
        esquinas[0] = esquina1;
        esquinas[1] = esquina2;
        esquinas[2] = new int[]{esquina1[0], esquina2[1]};
        esquinas[3] = new int[]{esquina2[0], esquina1[1]};
    }

    public void imprimirEsquinas() {
        //mostramos las cuatro esquinas en el formato correcto
        for (int i = 0; i < 4; i++) {
            System.out.println(esquinas[i][0] + "." + esquinas[i][1]);
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
}
