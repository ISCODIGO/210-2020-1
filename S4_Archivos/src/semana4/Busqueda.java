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
public class Busqueda {

    public static void main(String[] args) {
        
        String busqueda = "Joker";
        String contenido = "Joker es catalogado como uno de los mejores "
                + "personajes y villanos historietas, cuya popularidad le ha "
                + "permitido aparecer en una variedad de productos y medios, "
                + "entre los cuales se encuentran series televisivas, "
                + "animaciones, largometrajes, videojuegos, juguetes, ropa y "
                + "atracciones de parques de diversiones. Algunos actores que "
                + "han dado voz al personaje de Joker son Mark Hamill, Troy "
                + "Baker y Richard Epcar, mientras que Cesar Romero, Jack "
                + "Nicholson, Heath Ledger, Jared Leto y Joaquin Phoenix lo "
                + "han interpretado en el cine";
        System.out.println("Esta la palabra en el texto? " + 
                contenido.contains(busqueda));
        System.out.println("Indice donde ocurre la primera aparicion: " + 
                contenido.indexOf(busqueda));
        System.out.println("Indice donde ocurre la ultima aparicion: " + 
                contenido.lastIndexOf(busqueda));
        System.out.println("La palabra esta al inicio del texto? " + 
                contenido.startsWith(busqueda));
        System.out.println("La palabra esta al final del texto? " + 
                contenido.endsWith(busqueda));

        String[] palabras = contenido.split(" ");
        System.out.println("Hay " + palabras.length + " palabras");

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            palabra = palabra.replace(",", "");
            palabra = palabra.replace(".", "");
            System.out.println(i + ". " + palabra);
        }

        String input = " Avila ";
        System.out.println("[" + input.trim() + "]");

        String s1 = "hola";
        String s2 = new String("hola");

        // Identifica si la referencia de memoria de ambos objetos es la misma
        System.out.println("Uso de == " + (s1 == s2));          // Return false
        // Identifica si el valor lexicografico de una cadena es igual a la otra
        System.out.println("Uso de equals " + s1.equals(s2));   // Return true

        String s3 = "hola";
        String s4 = "HOLA";

        System.out.println(s3.equals(s4));              // Return false
        System.out.println(s3.equalsIgnoreCase(s4));    // Return true

    }
}
