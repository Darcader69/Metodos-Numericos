public class ErrorRedondeo2 {
    public static void main(String[] args) {
        double pi = Math.PI;
        double redondeado = Math.round(pi * 10000.0) / 10000.0;
        System.out.println("PI redondeado: " + redondeado);
    }
}