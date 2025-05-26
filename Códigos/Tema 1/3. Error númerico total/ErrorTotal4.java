public class ErrorTotal4 {
    public static void main(String[] args) {
        double exacto = 1.0 / 7.0;
        double aprox = 0.142;
        double error = Math.abs(exacto - aprox);
        System.out.println("Error total: " + error);
    }
}