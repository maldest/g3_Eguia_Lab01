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

     //calcula la distancia mínima entre dos rectángulos si son disjuntos
     public static double distanciaEntre(Rectangulo a, Rectangulo b) {
        if (!sonDisjuntos(a, b)) {
            return 0; //si no son disjuntos, la distancia es 0
        }

        int[] a1 = a.getEsquina1(), a2 = a.getEsquina2();
        int[] b1 = b.getEsquina1(), b2 = b.getEsquina2();

        int dx = 0, dy = 0;

        //si hay separación en X
        if (a2[0] < b1[0]) { 
            dx = b1[0] - a2[0]; 
        } else if (b2[0] < a1[0]) { 
            dx = a1[0] - b2[0]; 
        }

        //si hay separación en Y
        if (a2[1] < b1[1]) { 
            dy = b1[1] - a2[1]; 
        } else if (b2[1] < a1[1]) { 
            dy = a1[1] - b2[1]; 
        }

        //si hay separación en X e Y, usamos distancia euclidiana
        if (dx > 0 && dy > 0) {
            return Math.sqrt(dx * dx + dy * dy);
        }
        
        //si solo hay separación en un eje, devolvemos la distancia en ese eje
        return Math.max(dx, dy);
    }


}
