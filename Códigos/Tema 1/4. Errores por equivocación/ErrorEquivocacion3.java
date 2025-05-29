public class ErrorEquivocacion3 {
    public static void main(String[] args) {
        double f = 10;
        double c = (f - 32) * 5 + 9; // Debería ser (f - 32) * 5 / 9
        System.out.println("Conversión incorrecta: " + c);
    }
}
//
// Ejecución del programa
// Conversión incorrecta: 58.333333333333336
//