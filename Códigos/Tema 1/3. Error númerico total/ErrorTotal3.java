public class ErrorTotal3 {
    public static void main(String[] args) {
        double exacto = Math.E;
        double aprox = 2.71;
        double error = Math.abs(exacto - aprox);
        System.out.println("Error total: " + error);
    }
}