public class ErrorTruncamiento {
    public static void main(String[] args) {
        double x = 0.2;
        double approx = 1 - x + (x * x) / 2;
        System.out.println("Aproximación: " + approx);
    }
}