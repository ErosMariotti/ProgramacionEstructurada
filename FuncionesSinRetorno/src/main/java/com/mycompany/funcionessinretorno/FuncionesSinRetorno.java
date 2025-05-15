
package com.mycompany.funcionessinretorno;

public class FuncionesSinRetorno {

    public static void main(String[] args) {
         // Funciones SIN retorno
        System.out.println("🔹 Funciones sin retorno:");
        imprimirLineaConAsteriscos(5);
        imprimirLineaConAsteriscos(10);

        // Funciones CON retorno
        System.out.println("\n🔹 Funciones con retorno:");
        String linea1 = generarLineaConGuiones(5);
        String linea2 = generarLineaConGuiones(10);

        // Mostramos los resultados que obtuvimos en la función con retorno.
        System.out.println(linea1);
        System.out.println(linea2);
    }
    
     /**
     * Función SIN retorno.
     * Imprime directamente una línea con N asteriscos.
     * @param cantidad Número de asteriscos
     */
    public static void imprimirLineaConAsteriscos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print("*");
        }
        System.out.println(); // Salto de línea
    }

    /**
     * Función CON retorno.
     * Devuelve una línea con N guiones.
     * @param cantidad Número de guiones
     * @return Cadena generada
     */
    public static String generarLineaConGuiones(int cantidad) {
        String linea = "";
        for (int i = 0; i < cantidad; i++) {
            linea += "-";
        }
        return linea;
    }
}
