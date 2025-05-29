public class ErrorTruncamiento5 {
    public static void main(String[] args) {
        double x = 0.6;
        double approx = 1 - x + Math.pow(x, 2) / 2;
        System.out.println("Aproximación truncada: " + approx);
    }
}
//
// Ejecución del programa
// Aproximación truncada: 0.82
//