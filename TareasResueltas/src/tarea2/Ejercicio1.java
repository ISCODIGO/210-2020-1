package tarea2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Adivina un numero entre 1 y N... N es: ");
        int rangoMaximo = lector.nextInt();
        int intentos = (int) Math.round(Math.log(rangoMaximo) / Math.log(2));
        int secreto = random.nextInt(rangoMaximo) + 1;
        boolean haGanado = false;

        while(intentos > 0 || haGanado) {
            System.out.printf("Escriba un numero: ");
            int valor = lector.nextInt();

            if (valor == secreto) {
                System.out.println("*** Ha ganado ***");
                haGanado = true;
                break;
            }

            if (valor < secreto) {
                System.out.println("El valor escrito es MENOR al que debe adivinar");
            } else {
                System.out.println("El valor escrito es MAYOR al que debe adivinar");
            }

            intentos--;
            System.out.printf("Quedan %d intentos%n", intentos);
        }

        if (!haGanado) {
            System.out.println("Ha perdido. El numero era " + secreto);
        }
    }

}
