/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerArchivo {
    public static void main(String[] args) {
        String ruta = "c:\\UNAH\\2020-01\\IS210\\archivo.dat";
        int total = 0;

        try {
            FileReader fr = new FileReader(ruta);
            Scanner entrada = new Scanner(fr);

            while (entrada.hasNext()) {
                int valor = entrada.nextInt();
                total += valor;
            }

            System.out.printf("El total es %d%n", total);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
