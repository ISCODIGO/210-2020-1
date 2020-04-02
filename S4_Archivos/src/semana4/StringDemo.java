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
public class StringDemo {

    public static void main(String[] args) {
        
        // Inicializacion de String
        String str1 = "Hola Mundo";

        // Determinar el tamaño de una cadena
        int size = str1.length();

        // Para localizar un caracter dentro de una cadena
        char tercerLetra = str1.charAt(2);
                
        for (char letra : str1.toCharArray()) {
            System.out.println(letra);
        }

        char[] caracteres = str1.toCharArray();
        char cuartoCaracter = caracteres[3];
        
        // Localizar todos los caracteres en la cadena
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        // Obtener una subcadena a partir del indice 3
        String subStr1 = str1.substring(3);
        System.out.println(subStr1);          // Imprime: a Mundo
        // Obtener la subcadena entre el 3 y 5 indice
        // Siempre es indice final - 1
        String subStr2 = str1.substring(3, 6);
        System.out.println(subStr2);          // Imprime: a M
        
        
    }
}
