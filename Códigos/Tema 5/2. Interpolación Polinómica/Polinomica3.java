public class Polinomica3 {
    static class Punto { double x, y; Punto(double x, double y) { this.x = x; this.y = y; } }
    public static void main(String[] args) {
        Punto[] puntos = { new Punto(-1, 2), new Punto(0, 1), new Punto(1, 2) };
        double x = 0.5;
        double resultado = 0;
        for (int i = 0; i < puntos.length; i++) {
            double termino = puntos[i].y;
            for (int j = 0; j < puntos.length; j++) {
                if (j != i) termino *= (x - puntos[j].x) / (puntos[i].x - puntos[j].x);
            }
            resultado += termino;
        }
        System.out.println("y = " + resultado); // y ≈ 1.25
    }
}
// Ejecución del programa
// y = 1.25
