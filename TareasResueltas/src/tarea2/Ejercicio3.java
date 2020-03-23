package tarea2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular el valor de a^b");
        System.out.print("Escriba el valor de a: ");
        int base = entrada.nextInt();
        System.out.print("Escriba el valor de b: ");
        int exponente = entrada.nextInt();

        if (exponente >= 0) {
            int resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }

            System.out.printf("%d^%d = %d%n", base, exponente, resultado);
        } else {
            System.out.println("No es posible calcular este valor");
        }
    }
}
