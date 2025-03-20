package PyPooEje1;

public class Verificador {

    // Verifica si dos rectángulos se sobreponen
    public static boolean seSobreponen(Rectangulo a, Rectangulo b) {
        return !(a.getEsquina2().getX() <= b.getEsquina1().getX() ||
                 a.getEsquina1().getX() >= b.getEsquina2().getX() ||
                 a.getEsquina2().getY() <= b.getEsquina1().getY() ||
                 a.getEsquina1().getY() >= b.getEsquina2().getY());
    }

    // Verifica si dos rectángulos están juntos
    public static boolean estanJuntos(Rectangulo a, Rectangulo b) {
        return !seSobreponen(a, b) &&
               (a.getEsquina2().getX() == b.getEsquina1().getX() ||
                a.getEsquina1().getX() == b.getEsquina2().getX() ||
                a.getEsquina2().getY() == b.getEsquina1().getY() ||
                a.getEsquina1().getY() == b.getEsquina2().getY());
    }

    // Verifica si dos rectángulos son disjuntos
    public static boolean sonDisjuntos(Rectangulo a, Rectangulo b) {
        return !seSobreponen(a, b) && !estanJuntos(a, b);
    }
}
