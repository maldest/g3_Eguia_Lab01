package PyPooAct1;

public class TestVerificador {
    public static void main(String[] args) {
        Rectangulo rectA = new Rectangulo(new Coordenada(1, 1), new Coordenada(4, 4));
        Rectangulo rectB = new Rectangulo(new Coordenada(3, 3), new Coordenada(6, 6));

        System.out.println("Se sobreponen: " + Verificador.seSobreponen(rectA, rectB));
        System.out.println("Están juntos: " + Verificador.estanJuntos(rectA, rectB));
        System.out.println("Son disjuntos: " + Verificador.sonDisjuntos(rectA, rectB));
    }
}
