public class Interpolacion {
    public static void main(String[] args) {
        double x0 = 1.0, y0 = 2.0; // Punto (x0, y0)
        double x1 = 3.0, y1 = 5.0; // Punto (x1, y1)
        double x = 2.0; // Punto a interpolar

        double y = y0 + ((y1 - y0) / (x1 - x0)) * (x - x0);
        System.out.printf("f(%.2f) ≈ %.4f\n", x, y); // Resultado: 3.5
    }
}
//
// Ejecución del programa
// f(2.00) ≈ 3.5000
//