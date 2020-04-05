/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeavila
 */
public class EscribirArchivo {

    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            String ruta = "prueba.txt";
            pw = new PrintWriter(ruta);
            
            for (int i = 1; i <= 1000; i++) {
                pw.println(i);
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }
}
