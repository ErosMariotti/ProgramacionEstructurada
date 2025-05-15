/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fiesta_de_dracula;

/**
 *
 * @author Usuario
 */
public class Fiesta_de_dracula {

    public static void main(String[] args) {
        // Simulación del cambio de colores para los tres focos
        cambiarColorFocoVariasVeces(5);
        pasarAlSiguienteFoco();

        cambiarColorFocoVariasVeces(8);
        pasarAlSiguienteFoco();

        cambiarColorFocoVariasVeces(12);
        empezarFiesta();
    }
    
    /**
     * Cambia el color del foco N cantidad de veces.
     * @param n Cantidad de veces que debe cambiar el color.
     */
    public static void cambiarColorFocoVariasVeces(int n) {
        for (int i = 0; i < n; i++) {
            cambiarColorDelFoco();
        }
    }

    /**
     * Simula el cambio de color del foco.
     */
    public static void cambiarColorDelFoco() {
        System.out.println("💡 El foco cambió de color.");
    }

    /**
     * Simula el cambio al siguiente foco.
     */
    public static void pasarAlSiguienteFoco() {
        System.out.println("➡️ Pasando al siguiente foco...\n");
    }

    /**
     * Indica que la fiesta comienza.
     */
    public static void empezarFiesta() {
        System.out.println("🎉 ¡La fiesta de Drácula ha comenzado!");
    }
}
