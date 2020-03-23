/*
Ejercicio 2
Diseñar una función que establezca la siguiente figura. Esta función debe tener como
entrada el pico (punto máximo).
 
*
**
***
****
*****
******
*******
******
*****
****
***
**
*

 */
package tarea3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void piramide(int pico) {
        char figura = '*';

        // Parte ascendente
        for (int i = 1; i <= pico; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(figura);
            }
            System.out.println("");
        }

        // Parte descendente
        for (int i = pico - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(figura);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el punto maximo de la figura: ");
        int n = entrada.nextInt();
        piramide(n);
    }

}
