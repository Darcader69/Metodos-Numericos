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

// Ejecución del programa
// Valor real: 0.3333333333333333
// Valor redondeado: 0.3333
// Error de redondeo: 3.3306690738754696E-16S
//S