public class ErrorEquivocacion4 {
    public static void main(String[] args) {
        double s = 100;
        double tiempo = s / 60 + 2; // Debería ser (s / 60) + 2 si 2 es extra
        System.out.println("Tiempo incorrecto: " + tiempo);
    }
}
//
// Ejecución del programa
// Tiempo incorrecto: 3.6666666666666665
//