
package com.mycompany.documentacionappcalculadora;


/**
 * Esta clase contiene utilidades matemáticas simples
 * para operaciones básicas como sumar, restar y verificar múltiplos.
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     int resultado = CalculadoraUtils.sumar(5, 3);
 * </pre>
 * </p>
 */
public class CalculadoraUtils {
     /**
     * Suma dos números enteros.
     * @param a Primer número
     * @param b Segundo número
     * @return La suma de a + b
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Determina si el primer número es múltiplo del segundo.
     * @param a El número a verificar
     * @param b El divisor
     * @return true si a es múltiplo de b, false en caso contrario
     */
    public static boolean esMultiplo(int a, int b) {
        return obtenerResto(a, b) == 0;
    }

    /**
     * Calcula el resto entre dos números.
     * @param num1 Dividendo
     * @param num2 Divisor
     * @return El resto de la división
     * @throws ArithmeticException si el divisor es cero
     */
    public static int obtenerResto(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return num1 % num2;
    }
}
