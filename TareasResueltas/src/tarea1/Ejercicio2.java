package tarea1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero decimal");
        float numero = Math.round(entrada.nextFloat());
        System.out.println(numero);
    }
}
