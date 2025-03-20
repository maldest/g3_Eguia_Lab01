package Clase01;
//Método de clases(Estaticos)
// pertenece a una clase NO a una instancia 
//Define con STATIC
public class Utilidades {
    private String nombre;

    public static void mostrarMensaje (String mensaje) {
   System.out.println("Mensaje: " + mensaje);
    }
    //El método asignarNombre() no recibe parámetros, así que this.nombre = nombre; no hacia nada 
    //Ahora asignarNombre() recibe un parámetro nombre para asignarlo correctamente.
   public void asignarNombre (String nombre) {
       this.nombre = nombre;
  }
  public void mostrarNombre() {
   System.out.println("El nombre del curso  es " + this.nombre);
   }   
}
   