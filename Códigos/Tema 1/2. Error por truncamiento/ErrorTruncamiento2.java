public class ErrorTruncamiento2 {
    public static void main(String[] args) {
        double x = 0.5;
        double approx = 1 - x + (x * x) / 2 - (Math.pow(x, 3) / 6);
        System.out.println("Aproximación: " + approx);
    }
}