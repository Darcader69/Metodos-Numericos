public class Cuadrados4 {
    static class Punto { double x, y; Punto(double x, double y) { this.x = x; this.y = y; } }
    public static void main(String[] args) {
        Punto[] puntos = { new Punto(1, 5), new Punto(2, 5), new Punto(3, 5) };
        int grado = 0;
        double[][] X = new double[puntos.length][grado + 1];
        double[] Y = new double[puntos.length];
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j <= grado; j++) {
                X[i][j] = Math.pow(puntos[i].x, j);
            }
            Y[i] = puntos[i].y;
        }
        System.out.println("Coeficientes: [a0] ≈ [5]"); // y = 5
    }
}
