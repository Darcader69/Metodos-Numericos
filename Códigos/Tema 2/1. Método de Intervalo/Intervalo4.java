public class Intervalo4 {
    public static void main(String[] args) {
        double a = -1, b = 1, paso = 0.01;
        for (double x = a; x <= b; x += paso) {
            if (Math.abs(f(x)) < 0.01) { // Tolerancia
                System.out.printf("Raíz cerca de %.2f%n", x);
            }
        }
    }
    public static double f(double x) { return x * x * x - x; }
}