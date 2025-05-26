public class ErrorTotal {
    public static void main(String[] args) {
        double exacto = Math.sqrt(2);
        double aprox = 1.41;
        double error = Math.abs(exacto - aprox);
        System.out.println("Error total: " + error);
    }
}