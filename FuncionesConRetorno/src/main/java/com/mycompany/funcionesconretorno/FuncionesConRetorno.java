
package com.mycompany.funcionesconretorno;

public class FuncionesConRetorno {

    public static void main(String[] args) {
        // Ejemplos de uso
        int resultado1 = siguiente(4);
        System.out.println("Siguiente de 4: " + resultado1);

        String saludo = saludar("Charly");
        System.out.println(saludo);

        String repetido = repetirSimbolo('@', 5);
        System.out.println(repetido);
    }
    
    /**
     * Devuelve el número siguiente al ingresado.
     * @param n Número base
     * @return Número siguiente
     */
    public static int siguiente(int n) {
        return n + 1;
    }

    /**
     * Devuelve un saludo personalizado con el nombre recibido.
     * @param nombre Nombre de la persona
     * @return Saludo en formato "Hola <nombre>"
     */
    public static String saludar(String nombre) {
        return "Hola " + nombre;
    }

    /**
     * Repite un símbolo determinado la cantidad de veces deseada.
     * @param simbolo Carácter a repetir
     * @param cantidad Veces que se debe repetir
     * @return String con el símbolo repetido
     */
    public static String repetirSimbolo(char simbolo, int cantidad) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            resultado.append(simbolo);
        }
        return resultado.toString();
    }
}
