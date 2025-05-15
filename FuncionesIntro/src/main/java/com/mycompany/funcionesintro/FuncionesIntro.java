

package com.mycompany.funcionesintro;

import java.util.Scanner;

public class FuncionesIntro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nombre = pedirNombre(input);
        int edad = pedirNumero(input);

        mostrarResultados(nombre, edad);
    }
    
    /**
     * Solicita al usuario su nombre y lo devuelve.
     * @param input Scanner para leer desde consola
     * @return Nombre ingresado
     */
    public static String pedirNombre(Scanner input) {
        System.out.print("Ingresá tu nombre: ");
        return input.nextLine();
    }

    /**
     * Solicita al usuario un número entero y lo devuelve.
     * @param input Scanner para leer desde consola
     * @return Número entero ingresado
     */
    public static int pedirNumero(Scanner input) {
        System.out.print("Ingresá un número entero: ");
        return Integer.parseInt(input.nextLine());
    }

    /**
     * Muestra los resultados por consola.
     * @param nombre Nombre ingresado
     * @param num Número ingresado
     */
    public static void mostrarResultados(String nombre, int num) {
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu edad es " + num);
    }
}
