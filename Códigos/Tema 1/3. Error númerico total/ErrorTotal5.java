public class ErrorTotal5 {
    public static void main(String[] args) {
        double exacto = Math.log(10);
        double aprox = 2.3;
        double error = Math.abs(exacto - aprox);
        System.out.println("Error total: " + error);
    }
}
//
// Ejecución del programa
// Error total: 0.001592653589793238
//