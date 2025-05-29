public class Interpolacionlineal5 {
public static Double interpolar(double x0, double y0, double x1, double
y1, double x) {
if (x1 == x0) {
return null;
}
return y0 + ((y1 - y0) / (x1 - x0)) * (x - x0);
}
public static void main(String[] args) {
// Datos de ejemplo
double x0 = 15;
double y0 = 997.1;
double x1 = 35;
double y1 = 994;
double x = 22.5;
Double resultado = interpolar(x0, y0, x1, y1, x);
if (resultado == null) {
System.out.println("Error: x0 y x1 no pueden ser iguales (division por cero).");
} else {
System.out.printf("El valor interpolado en x = %.2f es: f(x) = %.2f%n", x, resultado);
}
}
}
// Ejecución del programa
// El valor interpolado en x = 22.50 es: f(x) = 995.55