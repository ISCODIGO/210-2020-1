package tarea1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int CANTIDAD = 5;
        System.out.println("Ingrese 5 numeros");
        int suma = 0;
        for (int i = 0; i < CANTIDAD; i++) {
            int numero = Math.round(entrada.nextFloat());
            suma += numero;
            System.out.println("El numero redondeado es: " + numero);
        }
        
        float promedio = suma / CANTIDAD;

        System.out.printf("La suma: %d y el promedio: %f%n", suma, promedio);
    }
}
