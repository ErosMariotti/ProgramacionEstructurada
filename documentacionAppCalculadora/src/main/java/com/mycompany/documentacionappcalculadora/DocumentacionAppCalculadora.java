

package com.mycompany.documentacionappcalculadora;

public class DocumentacionAppCalculadora {

    public static void main(String[] args) {
        System.out.println("🔢 Pruebas de CalculadoraUtils");

        int suma = CalculadoraUtils.sumar(10, 7);
        System.out.println("Suma: " + suma); // 17

        boolean multiplo = CalculadoraUtils.esMultiplo(20, 5);
        System.out.println("¿Es múltiplo?: " + multiplo); // true

        int resto = CalculadoraUtils.obtenerResto(17, 3);
        System.out.println("Resto: " + resto); // 2
    }
}
