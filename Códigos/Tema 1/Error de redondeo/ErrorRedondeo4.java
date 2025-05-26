public class ErrorRedondeo4 {
    public static void main(String[] args) {
        double num = 7.777777;
        double redondeado = Math.round(num * 1000.0) / 1000.0;
        System.out.println("Número redondeado: " + redondeado);
    }
}