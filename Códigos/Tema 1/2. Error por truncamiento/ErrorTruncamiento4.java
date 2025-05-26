public class ErrorTruncamiento4 {
    public static void main(String[] args) {
        double x = 0.3;
        double approx = 1 - x + Math.pow(x, 2) / 2 - Math.pow(x, 3) / 6 + Math.pow(x, 4) / 24;
        System.out.println("Aproximación: " + approx);
    }
}