package tarea3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba una nota: ");
        double nota = entrada.nextDouble();
        int opcion = (int) nota / 10;
        char letra = ' ';

        switch (opcion) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                letra = 'F';
                break;
            case 6:
                letra = 'D';
                break;
            case 7:
                letra = 'C';
                break;
            case 8:
                letra = 'B';
                break;
            case 9:
            case 10:
                letra = 'A';
                break;
            default:
                letra = ' ';
        }

        System.out.println("Su calificacion es: " + letra);

    }
}
