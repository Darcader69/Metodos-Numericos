public class ErrorTotal2 {
    public static void main(String[] args) {
        double exacto = Math.PI;
        double aprox = 3.14;
        double error = Math.abs(exacto - aprox);
        System.out.println("Error total: " + error);
    }
}