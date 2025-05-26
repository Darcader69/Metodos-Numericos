public class ErrorTruncamiento {
    public static void main(String[] args) {
        double x = 0.5;
        double valorReal = Math.exp(-x);
        double aproximacion = 1 - x + (Math.pow(x, 2) / 2);
        double error = valorReal - aproximacion;

        System.out.println("Valor real: " + valorReal);
        System.out.println("Aproximación: " + aproximacion);
        System.out.println("Error por truncamiento: " + error);
    }
}
