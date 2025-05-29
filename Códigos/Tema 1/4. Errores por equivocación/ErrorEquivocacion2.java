public class ErrorEquivocacion2 {
    public static void main(String[] args) {
        double b = 4, h = 5;
        double area = b + h / 2; // Debería ser (b * h) / 2
        System.out.println("Área incorrecta: " + area);
    }
}
//
// Ejecución del programa
// Área incorrecta: 6.0
//