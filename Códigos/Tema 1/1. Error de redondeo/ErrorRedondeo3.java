public class ErrorRedondeo3 {
    public static void main(String[] args) {
        double raiz = Math.sqrt(2);
        double redondeado = Math.round(raiz * 100.0) / 100.0;
        System.out.println("Raíz de 2 redondeada: " + redondeado);
    }
}