package PyPooAct1;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

 // Constructor
// Copiamos c1 yc2  para evitar modificar 
    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = new Coordenada(c1); 
        this.esquina2 = new Coordenada(c2); 
    }

// Métodos SET para cambiar las coordenadas
    public void setEsquina1(Coordenada coo) {
        this.esquina1 = new Coordenada(coo);
    }

    public void setEsquina2(Coordenada coo) {
        this.esquina2 = new Coordenada(coo);
    }

// Métodos GET para obtener las coordenadas
    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

// Método para calcular el área del rectángulo
    public double calculoArea() {
        double base = Math.abs(esquina2.getX() - esquina1.getX());
        double altura = Math.abs(esquina2.getY() - esquina1.getY());
        return base * altura;
    }

// Método toString para mostrar el rectángulo
    @Override
    public String toString() {
        return "Rectángulo: [" + esquina1 + ", " + esquina2 + "]";
    }
}