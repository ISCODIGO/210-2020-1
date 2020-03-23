package tarea2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("A continuacion escriba numeros enteros. "
                + "Para finalizar coloque un valor con otro tipo de dato...");
        int sumaPares = 0;
        int sumaImpares = 0;

        while (entrada.hasNextInt()) {
            int numero = entrada.nextInt();
            
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }
        
        System.out.printf("La suma de pares es: %d y la de impares: %d%n", 
                sumaPares, sumaImpares);

    }
}
