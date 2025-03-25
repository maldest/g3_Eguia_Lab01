package prueba;

public class Rectangulo {
    private double[][] esquinas; 

    public Rectangulo(double x1, double y1, double x2, double y2) {
        esquinas = new double[4][2];

        //guardar las dos esquinas ingresadas
        esquinas[0] = new double[]{x1, y1}; 
        esquinas[1] = new double[]{x2, y2}; 

        //calcula las dos esquinas faltantes
        esquinas[2] = new double[]{x1, y2}; 
        esquinas[3] = new double[]{x2, y1}; 
    }

    public double[] getEsquina1() {
        return new double[]{
            Math.min(esquinas[0][0], esquinas[1][0]),
            Math.min(esquinas[0][1], esquinas[1][1])
        };
    }

    public double[] getEsquina2() {
        return new double[]{
            Math.max(esquinas[0][0], esquinas[1][0]),
            Math.max(esquinas[0][1], esquinas[1][1])
        };
    }

    public double calcularArea() {
        double base = Math.abs(getEsquina2()[0] - getEsquina1()[0]);
        double altura = Math.abs(getEsquina2()[1] - getEsquina1()[1]);
        return base * altura;
    }

    @Override
    public String toString() {
        return String.format("([%s, %s], [%s, %s], [%s, %s], [%s, %s])",
                formatNumber(esquinas[0][0]), formatNumber(esquinas[0][1]),
                formatNumber(esquinas[1][0]), formatNumber(esquinas[1][1]),
                formatNumber(esquinas[2][0]), formatNumber(esquinas[2][1]),
                formatNumber(esquinas[3][0]), formatNumber(esquinas[3][1]));
    }
    
    private String formatNumber(double num) {
        return (num % 1 == 0) ? String.format("%.0f", num) : String.format("%.1f", num);
    }
    
}
