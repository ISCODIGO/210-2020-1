/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 *
 * @author jeavila
 */
public class Concatenar {
    public static void main(String[] args) {
        String saludo = "hola";
        StringBuilder sb = new StringBuilder("hola");
        
        /*for (int i = 0; i < 100_000; i++) {
            saludo = saludo + "hola";
        }*/
        
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("hola");
        }
        
        //System.out.println(sb.toString());
    }
}
