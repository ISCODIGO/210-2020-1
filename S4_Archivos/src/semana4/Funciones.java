/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

import java.util.Arrays;

/**
 *
 * @author jeavila
 */
public class Funciones {

    public static void main(String[] args) /* <- Firma de la funcion */ {
        // Cuerpo de la funcion
        saludar("Hola");
        saludar("Hola a todos");
        System.out.println(sumar(1, 10));

        boolean[] pruebas = {
            contarVocales("hola") == 2,
            contarVocales("murcielago") == 5,
            contarVocales("") == 0,
            contarVocales("qw") == 0, 
            contarVocales("canción") == 3
        };
                
        System.out.println(Arrays.toString(pruebas));
    }

    public static void saludar(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Esta es una funcion que suma dos numeros enteros
     *
     * @param a Primer argumento
     * @param b Segundo argumento
     * @return La suma de ambos argumentos
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Esta es una funcion que suma tres numeros enteros
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Paso 1: Definir el objetivo o proposito
    // Objetivo: Contabilizar las vocales de una cadena dada.
    // Paso 2: Definir una firma de la funcion
    // String -> int
    // Paso 3: Construir el prototipo de funcion (si retorna algo colocar valor
    // default)
    // Paso 4: Definir pruebas de la funcion
    /*
        contarVocales("hola") == 2
        contarVocales("murcielago") == 5
        contarVocales("") == 0
        contarVocales("qw") == 0
     */
    public static int contarVocales(String s) {
        // Ir letra por letra
        // Comparar si esa letra es una vocal
        // Si lo anterior es cierto ir acumulando ese resultado
        int contador = 0;
        for(char letra : s.toLowerCase().toCharArray()) {
            switch(letra) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'á': case 'é': case 'í': case 'ó': case 'ú':
                    contador++;
            }
        }
        
        return contador;
    }

}
