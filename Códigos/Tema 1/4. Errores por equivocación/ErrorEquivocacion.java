public class ErrorEquivocacion {
    public static void main(String[] args) {
        double r = 3;
        double area = Math.PI * r * 2; // Debería ser r^2
        System.out.println("Área incorrecta: " + area);
    }
}
//
// Ejecución del programa
// Área incorrecta: 18.84955592153876
//