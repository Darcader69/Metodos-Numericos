public class Biseccion4 {
    public static void main(String[] args) {
        double a = 1, b = 3;
        for (int i = 1; i <= 10; i++) {
            double c = (a + b) / 2;
            System.out.printf("Iter %d: c = %.6f, f(c) = %.6f%n", i, c, f(c));
            if (f(a) * f(c) < 0) b = c; else a = c;
        }
    }
    public static double f(double x) { return Math.log(x) - 1; }
}
//
// Ejecución del programa
//Iter 1: c = 2.000000, f(c) = -0.306853
//Iter 2: c = 2.500000, f(c) = -0.083709
//Iter 3: c = 2.750000, f(c) = 0.011601
//Iter 4: c = 2.625000, f(c) = -0.034919
//Iter 5: c = 2.687500, f(c) = -0.011389
//Iter 6: c = 2.718750, f(c) = 0.000172
//Iter 7: c = 2.703125, f(c) = -0.005591
//Iter 8: c = 2.710938, f(c) = -0.002705
//Iter 9: c = 2.714844, f(c) = -0.001266
//Iter 10: c = 2.716797, f(c) = -0.000546
// Raíz aproximada: 1.001953
//