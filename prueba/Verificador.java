package prueba;

public class Verificador {

    //verifica si dos rectángulos se sobreponen
    public static boolean seSobreponen(Rectangulo a, Rectangulo b) {
        int[] a1 = a.getEsquina1(), a2 = a.getEsquina2();
        int[] b1 = b.getEsquina1(), b2 = b.getEsquina2();

        return !(a2[0] <= b1[0] ||  //rectángulo A está completamente a la izquierda de B
                 a1[0] >= b2[0] ||  //rectángulo A está completamente a la derecha de B
                 a2[1] <= b1[1] ||  //rectángulo A está completamente abajo de B
                 a1[1] >= b2[1]);   //rectángulo A está completamente arriba de B
    }

    //verifica si dos rectángulos están juntos sin sobreponerse
    public static boolean estanJuntos(Rectangulo a, Rectangulo b) {
        int[] a1 = a.getEsquina1(), a2 = a.getEsquina2();
        int[] b1 = b.getEsquina1(), b2 = b.getEsquina2();

        return !seSobreponen(a, b) &&
               (a2[0] == b1[0] ||  //A y B están pegados por la izquierda/derecha
                a1[0] == b2[0] ||
                a2[1] == b1[1] ||  //A y B están pegados por arriba/abajo
                a1[1] == b2[1]);
    }

    //verifica si dos rectángulos no se tocan ni se sobreponen
    public static boolean sonDisjuntos(Rectangulo a, Rectangulo b) {
        return !seSobreponen(a, b) && !estanJuntos(a, b);
    }
}
