/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_numericos__desafio3;

/**
 *
 * @author hp
 */
public class Metodos_numericos__desafio3 {

    // Función para calcular e^x usando la serie de Taylor hasta el orden n
    public static double taylorSeries(double x, int n) {
        double sum = 0.0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(x, i) / factorial(i);
        }
        return sum;
    }

    // Función para calcular el factorial de un número
    private static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Función para calcular el error relativo porcentual
    public static double calculatePercentageError(double actual, double approx) {
        return Math.abs((actual - approx) / actual) * 100;
    }

    public static void main(String[] args) {
        double x = 1.0; // Valor en el que se evalúa e^x
        double actual = Math.exp(x);
System.out.println("CRISTIAN GONZALO MAMANI ESPINOZA ----- 12827829");
        for (int i = 0; i <= 3; i++) {
            double approx = taylorSeries(x, i);
            double error = calculatePercentageError(actual, approx);
            
            System.out.println("Orden " + i + ": " + approx);
            System.out.println("Error relativo porcentual: " + error + "%");
        }
    }
}
