/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Familia Martinez
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String boleto250 = "250";
        String boleto100 = "100";
        String boleto50 = "50";
        String boleto25 = "25";

        Scanner entrada = new Scanner(System.in);
        int vendidosA = 0;
        int vendidosB = 0;
        int vendidosC = 0;
        int vendidosD = 0;

        String opcion = null;
        int importeVentasA = 0;
        int importeVentasB = 0;
        int importeVentasC = 0;
        int importeVentasD = 0;
        int importeTotal = 0;
        do {
            System.out.println("Elija una de las siguientes opciones \n"
                    + "a.- para ingresar el total de boletos de 250$ \n"
                    + "b.- para ingresar el total de boletos de 100$ \n"
                    + "c.- para ingresar el total de boletos de 50$ \n"
                    + "d.- para ingresar el total de boletos de 25$ \n"
                    + "e.- para salir del sistema.");

            opcion = entrada.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Ingrese la cantidad de boletos vendidos de 250$ ");
                    vendidosA = entrada.nextInt();
                    importeVentasA = Integer.parseInt(boleto250) * vendidosA;
                    break;
                case "b":
                    System.out.println("Ingrese la cantidad de boletos vendidos de 100$ ");
                    vendidosB = entrada.nextInt();
                    importeVentasB = Integer.parseInt(boleto100) * vendidosB;
                    break;
                case "c":
                    System.out.println("Ingrese la cantidad de boletos vendidos de 50$ ");
                    vendidosC = entrada.nextInt();
                    importeVentasC = Integer.parseInt(boleto50) * vendidosC;
                    break;
                case "d":
                    System.out.println("Ingrese la cantidad de boletos vendidos de 25$ ");
                    vendidosD = entrada.nextInt();
                    importeVentasD = Integer.parseInt(boleto25) * vendidosD;
                    break;

                default:
                    System.out.println("introduzca una opcion valida");

            }

        } while (!("e".equals(opcion)));

        importeTotal += (importeVentasA + importeVentasB + importeVentasC + importeVentasD);

        try {
            PrintWriter pw = new PrintWriter("miArchivo.txt");
            pw.printf("%5s", "valor del boleto");
            pw.printf("%40s", "numero de tickets vendidos\n");
            pw.printf("%6s %40d\n", boleto250, vendidosA);
            pw.printf("%6s %40d\n", boleto100, vendidosB);
            pw.printf("%6s %40d\n", boleto50, vendidosC);
            pw.printf("%6s %40d\n", boleto25, vendidosD);
            pw.println("");
            pw.println("El importe total de ventas es de: " + importeTotal);
            pw.close();
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        leerArchivo("miArchivo.txt");

    }

    public static void leerArchivo(String ruta) {
        String texto;
        /*File archivo = new File("miArchivo.txt");
        if(!archivo.exists()){
            try{
                archivo.createNewFile();
                System.out.println(archivo.getName()+" ha sido creado");
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }*/
        try {
            FileReader leer = new FileReader(ruta);
            BufferedReader br = new BufferedReader(leer);
            System.out.println(br.readLine());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

    /*public static void escrituraArchivo(String ruta){
        String texto = "texto en el archivo";
        
        try{
            PrintWriter pw = new PrintWriter(ruta);
            pw.printf("%6s %40d\n", boleto25, vendidosD);
            pw.close();
        }catch(Exception err){
            
        }
        
    }*/
}
