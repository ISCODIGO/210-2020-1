/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Familia Martinez
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        float[] precios = {250, 100, 50, 25};
        int[] vendidos = new int[precios.length];
        double[] ventas = new double[precios.length];
        Scanner entrada = new Scanner(System.in);
        String opcion = "";

        do {
            System.out.println("Elija una de las siguientes opciones\n"
                    + "[1] Cantidad de boletos de $250\n"
                    + "[2] Cantidad de boletos de $100\n"
                    + "[3] Cantidad de boletos de $50\n"
                    + "[4] Cantidad de boletos de $25\n"
                    + "[0] Salir");

            opcion = entrada.nextLine();

            switch (opcion) {
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    System.out.print("Ingrese la cantidad de boletos vendidos de $250: ");
                    vendidos[0] = entrada.nextInt();
                    break;
                case "2":
                    System.out.print("Ingrese la cantidad de boletos vendidos de $100: ");
                    vendidos[1] = entrada.nextInt();
                    break;
                case "3":
                    System.out.print("Ingrese la cantidad de boletos vendidos de $50: ");
                    vendidos[2] = entrada.nextInt();
                    break;
                case "4":
                    System.out.print("Ingrese la cantidad de boletos vendidos de $25: ");
                    vendidos[3] = entrada.nextInt();
                    break;
                default:
                    System.out.println("Introduzca una opcion valida");
            }

        } while (true);

        double sumaVendida = 0;
        for (int i = 0; i < precios.length; i++) {
            ventas[i] = vendidos[i] * precios[i];
            sumaVendida += ventas[i];
        }

        try {
            PrintWriter pw = new PrintWriter("ejercicio3.txt");
            pw.printf("%5s%40s%n", "ticketPrice", "numberOfTicketsSold");
            pw.printf("%5s%40d%n", precios[0], ventas[0]);
            pw.printf("%5s%40d%n", precios[1], ventas[1]);
            pw.printf("%5s%40d%n", precios[2], ventas[2]);
            pw.printf("%5s%40d%n", precios[3], ventas[3]);
            pw.println("");
            pw.printf("total: %.2f%n", sumaVendida);
            pw.close();
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}
