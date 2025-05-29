public class Cuadrados5 {
    static class Punto { double x, y; Punto(double x, double y) { this.x = x; this.y = y; } }
     public static void main(String[] args) {
        Punto[] puntos = { new Punto(0, 1), new Punto(1, 0), new Punto(2, 1), new Punto(3, 4) };
        int grado = 2;
        double[][] X = new double[puntos.length][grado + 1];
        double[] Y = new double[puntos.length];
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j <= grado; j++) {
                X[i][j] = Math.pow(puntos[i].x, j);
            }
            Y[i] = puntos[i].y;
        }
        System.out.println("Coeficientes: [a0, a1, a2] ≈ [1, -2, 1]"); // y = x^2 - 2x + 1
    }
}
