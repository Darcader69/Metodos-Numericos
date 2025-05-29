public class Correlacion {
    static class Punto { double x, y; Punto(double x, double y) { this.x = x; this.y = y; } }
    public static void main(String[] args) {
        Punto[] puntos = { new Punto(1, 1), new Punto(2, 2), new Punto(3, 3) };
        int n = puntos.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0;
        for (Punto p : puntos) {
            sumX += p.x;
            sumY += p.y;
            sumXY += p.x * p.y;
            sumX2 += p.x * p.x;
            sumY2 += p.y * p.y;
        }
        double numerador = n * sumXY - sumX * sumY;
        double denominador = Math.sqrt( (n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY) );
        double r = numerador / denominador;
        System.out.println("r = " + r); // r = 1.0
    }
}