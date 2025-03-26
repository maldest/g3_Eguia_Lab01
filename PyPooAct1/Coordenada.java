package PyPooEje1;

// private -> hace que x e y sean privado NADIE pueda cambiarlo directamente desde fuera de la clase 
//double -> pueden tener decimal
public class Coordenada {
    private double x;
    private double y;

//--------------------------------------------------------------------------------//
//constructor -> cuando creamos un nuevo objeto para darle valores iniciales 

// Constructor sin parámetros
//Se ejecuta cuando no le damos valores a la coordenada
//this.x -> es para decirle a Java que estamos modificando el atributo x de este objeto bueno en este caso x e y 

    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

// Constructor con parámetros
// Se ejecuta cuando hay valores especificos en la coordenada 
// THIS.X = X -> X es el nombre del parámetro y THIS.X es el atributo de la clase
//Recordatorio: si no usamos el THIS el java puede confundir el parametro (x e y) con el atributo ACUERDATE!!!! 
    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

// Constructor copia
    public Coordenada(Coordenada c) {
        this.x = c.x;
        this.y = c.y;
    }
// por que c? 

// Métodos setter (obtener valores )
//Nos permiten cambiar x e y sin modificar el código directamente
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

// Métodos getter (modifica valores)
//Nos permiten leer x e y de forma segura
    public double getX() { return x; }
    public double getY() { return y; }

// Método para calcular la distancia entre dos coordenadas
// Calcula la distancia de this y la coordenada C
    public double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));
    }

// Método estático para calcular la distancia entre dos coordenadas SIN LA NECESIDAD DE UN OBJETO THIS 
    public static double distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt(Math.pow(c1.x - c2.x, 2) + Math.pow(c1.y - c2.y, 2));
    }

    // Método toString para mostrar la coordenada
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
