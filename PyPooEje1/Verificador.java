package prueba;

class Verificador {
    public static boolean seSobreponen(Rectangulo a, Rectangulo b) {
        double[] a1 = a.getEsquina1(), a2 = a.getEsquina2();
        double[] b1 = b.getEsquina1(), b2 = b.getEsquina2();

        return !(a2[0] <= b1[0] || a1[0] >= b2[0] || a2[1] <= b1[1] || a1[1] >= b2[1]);
    }

    public static boolean estanJuntos(Rectangulo a, Rectangulo b) {
        double[] a1 = a.getEsquina1(), a2 = a.getEsquina2();
        double[] b1 = b.getEsquina1(), b2 = b.getEsquina2();

        return !seSobreponen(a, b) &&
               (a2[0] == b1[0] || a1[0] == b2[0] || a2[1] == b1[1] || a1[1] == b2[1]);
    }

    public static double distanciaEntre(Rectangulo a, Rectangulo b) {
        if (seSobreponen(a, b) || estanJuntos(a, b)) {
            return 0;
        }

        double[] a1 = a.getEsquina1(), a2 = a.getEsquina2();
        double[] b1 = b.getEsquina1(), b2 = b.getEsquina2();

        double dx = 0, dy = 0;

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

        return Math.sqrt(dx * dx + dy * dy);
    }
}
