public class ErrorEquivocacion5 {
    public static void main(String[] args) {
        double v = 20;
        double t = 2;
        double d = v + t; // Debería ser v * t
        System.out.println("Distancia incorrecta: " + d);
    }
}
//
// Ejecución del programa
// Distancia incorrecta: 22.0
//