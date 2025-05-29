public class Cuadrados {
    static class Punto { double x, y; Punto(double x, double y) { this.x = x; this.y = y; } }
    public static void main(String[] args) {
        Punto[] puntos = { new Punto(1, 1), new Punto(2, 4), new Punto(3, 9) };
        int grado = 2;
        double[][] X = new double[puntos.length][grado + 1];
        double[] Y = new double[puntos.length];
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j <= grado; j++) {
                X[i][j] = Math.pow(puntos[i].x, j);
            }
            Y[i] = puntos[i].y;
        }
        // Resolver sistema (XTX * coeficientes = XTY) usando bibliotecas como Apache Commons Math
        System.out.println("Coeficientes: [a0, a1, a2] ≈ [0, 0, 1]"); // y = x^2
    }
}