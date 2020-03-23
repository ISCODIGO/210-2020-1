package tarea2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] caracteres = new String[3];
        System.out.print("Primer cadena: ");
        caracteres[0] = entrada.nextLine();
        System.out.print("Segunda cadena: ");
        caracteres[1] = entrada.nextLine();
        System.out.print("Tercera cadena: ");
        caracteres[2] = entrada.nextLine();

        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres.length; j++) {
                for (int k = 0; k < caracteres.length; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.printf("%s-%s-%s%n", caracteres[i], 
                                caracteres[j], caracteres[k]);
                    }
                }
            }
        }

    }

}
