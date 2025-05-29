public class Regresion3 {
    static class Punto { double x, y; Punto(double x, double y) { this.x = x; this.y = y; } }
    public static void main(String[] args) {
        Punto[] puntos = { new Punto(-1, 0), new Punto(0, 1), new Punto(1, 0) };
        int n = puntos.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        for (Punto p : puntos) {
            sumX += p.x;
            sumY += p.y;
            sumXY += p.x * p.y;
            sumX2 += p.x * p.x;
        }
        double m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double b = (sumY - m * sumX) / n;
        System.out.println("y = " + m + "x + " + b); // y = 0.0x + 0.333...
    }
}
// Ejecución del programa
// y = 0.0x + 0.3333333333333333