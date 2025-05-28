public class Intervalo {
    public static void main(String[] args) {
        double a = -2, b = 2, paso = 0.5;
        for (double x = a; x <= b; x += paso) {
            if (f(x) * f(x + paso) <= 0) {
                System.out.printf("Raíz en [%.2f, %.2f]%n", x, x + paso);
            }
        }
    }
    public static double f(double x) { return x * x - 2; }
}