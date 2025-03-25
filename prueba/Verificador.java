package prueba;

public class Verificador {
    public static boolean seSobreponen(Rectangulo a, Rectangulo b) {
        int[] a1 = a.getEsquina1(), a2 = a.getEsquina2();
        int[] b1 = b.getEsquina1(), b2 = b.getEsquina2();

        return !(a2[0] <= b1[0] || a1[0] >= b2[0] || a2[1] <= b1[1] || a1[1] >= b2[1]);
    }

    public static boolean estanJuntos(Rectangulo a, Rectangulo b) {
        int[] a1 = a.getEsquina1(), a2 = a.getEsquina2();
        int[] b1 = b.getEsquina1(), b2 = b.getEsquina2();

        return !seSobreponen(a, b) &&
               (a2[0] == b1[0] || a1[0] == b2[0] || a2[1] == b1[1] || a1[1] == b2[1]);
    }

    public static boolean sonDisjuntos(Rectangulo a, Rectangulo b) {
        return !seSobreponen(a, b) && !estanJuntos(a, b);
    }

    public static double distanciaEntre(Rectangulo a, Rectangulo b) {
        if (!sonDisjuntos(a, b)) {
            return 0; 
        }

        int[] a1 = a.getEsquina1(), a2 = a.getEsquina2();
        int[] b1 = b.getEsquina1(), b2 = b.getEsquina2();

        int dx = 0, dy = 0;

        if (a2[0] < b1[0]) { 
            dx = b1[0] - a2[0]; 
        } else if (b2[0] < a1[0]) { 
            dx = a1[0] - b2[0]; 
        }

        if (a2[1] < b1[1]) { 
            dy = b1[1] - a2[1]; 
        } else if (b2[1] < a1[1]) { 
            dy = a1[1] - b2[1]; 
        }

        if (dx > 0 && dy > 0) {
            return Math.sqrt(dx * dx + dy * dy);
        }
        
        return Math.max(dx, dy);
    }
}
