public class ErrorRedondeo {
    public static void main(String[] args) {
        double valorReal = 1.0 / 3.0;
        double valorRedondeado = Math.round(valorReal * 10000.0) / 10000.0;
        double error = valorReal - valorRedondeado;

        System.out.println("Valor real: " + valorReal);
        System.out.println("Valor redondeado: " + valorRedondeado);
        System.out.println("Error de redondeo: " + error);
    }
}
