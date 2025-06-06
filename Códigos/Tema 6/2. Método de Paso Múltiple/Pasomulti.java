public class Pasomulti {
    public static double f(double t, double y) {
        return y; // dy/dt = y
    }

    public static void main(String[] args) {
        double h = 0.2;
        double t0 = 0.0;
        double y0 = 1.0;
        double tf = 1.0;
        
        int n = (int)((tf - t0)/h);
        double[] t = new double[n+1];
        double[] y = new double[n+1];
        double[] exacto = new double[n+1];
        t[0] = t0;
        y[0] = y0;
        exacto[0] = Math.exp(t0);
        
        // RK4 para primeros 4 puntos
        for (int i = 0; i < 3; i++) {
            double k1 = f(t[i], y[i]);
            double k2 = f(t[i] + h/2, y[i] + h*k1/2);
            double k3 = f(t[i] + h/2, y[i] + h*k2/2);
            double k4 = f(t[i] + h, y[i] + h*k3);
            
            y[i+1] = y[i] + h*(k1 + 2*k2 + 2*k3 + k4)/6;
            t[i+1] = t[i] + h;
            exacto[i+1] = Math.exp(t[i+1]);
        }
        
        // Adams-Bashforth 4 pasos
        for (int i = 3; i < n; i++) {
            y[i+1] = y[i] + h*(55*f(t[i],y[i]) - 59*f(t[i-1],y[i-1]) + 
                       37*f(t[i-2],y[i-2]) - 9*f(t[i-3],y[i-3]))/24;
            t[i+1] = t[i] + h;
            exacto[i+1] = Math.exp(t[i+1]);
        }
        
        // Resultados comparativos
        System.out.println("Paso\t t\t\t y (AB4)\t y (Exacto)\t Error Abs.");
        for (int i = 0; i <= n; i++) {
            double error = Math.abs(exacto[i] - y[i]);
            System.out.printf("%d\t %.2f\t %.6f\t %.6f\t %.6f\n", 
                i, t[i], y[i], exacto[i], error);
        }
        
        // Error en t=1
        double errorFinal = Math.abs(exacto[n] - y[n]);
        System.out.printf("\nError absoluto en t=1: %.6f", errorFinal);
        System.out.printf("\nError relativo en t=1: %.6f%%", 
            (errorFinal/exacto[n])*100);
    }

}
// Ejecución del programa
// Paso     t               y (AB4)         y (Exacto)      Error Abs.
// 0        0.00    1.000000        1.000000        0.000000
// 1        0.20    1.221400        1.221403        0.000003
// 2        0.40    1.491818        1.491825        0.000007
// 3        0.60    1.822106        1.822119        0.000012
// 4        0.80    2.225360        2.225541        0.000181
// 5        1.00    2.717820        2.718282        0.000462