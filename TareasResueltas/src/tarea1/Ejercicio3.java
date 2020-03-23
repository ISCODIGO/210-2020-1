package tarea1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los segundos: ");
        int s = entrada.nextInt();
        
        int m = s / 60;
        s -= m * 60;

        int h = m / 60;
        m -= h * 60;
        
        System.out.printf("%02dh:%02dm:%02ds%n", h, m, s);
        entrada.close();
    }
}
