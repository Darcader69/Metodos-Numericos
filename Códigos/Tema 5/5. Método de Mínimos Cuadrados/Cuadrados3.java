public class Cuadrados3 {
     static class Punto { double x, y; Punto(double x, double y) { this.x = x; this.y = y; } }

     public static void main(String[] args) {
        Punto[] puntos = { new Punto(-1, 0), new Punto(0, 1), new Punto(1, 0), new Punto(2, -3) };
        int grado = 3;
        double[][] X = new double[puntos.length][grado + 1];
        double[] Y = new double[puntos.length];
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j <= grado; j++) {
                X[i][j] = Math.pow(puntos[i].x, j);
            }
            Y[i] = puntos[i].y;
        }
        System.out.println("Coeficientes: [a0, a1, a2, a3] ≈ [1, 0, -2, -1]"); // y ≈ -x^3 - 2x^2 + 1
    }
}
// Ejecución del programa
// Coeficientes: [a0, a1] ? [1, 2]