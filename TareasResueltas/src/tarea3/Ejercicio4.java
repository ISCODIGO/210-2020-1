package tarea3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int DIGITOS_VALIDOS = 7;

        System.out.print("Ingrese la frase: ");
        // Queda en minuscula de una sola vez
        String frase = entrada.nextLine().toLowerCase();
        // Eliminar los guiones
        frase = frase.replaceAll("-", "");
        // Obtener un array de char
        char[] letras = frase.toCharArray();

        // Solo se convertiran los primeros 7 digitos
        String telefono = "";
        for (int i = 0; i < DIGITOS_VALIDOS; i++) {
            telefono += obtenerDigito(letras[i]);

            // Agregar el parentesis del telefono
            if (i == 2) {
                telefono += "-";
            }
        }

        System.out.println("El telefono es: " + telefono);
    }

    static String obtenerDigito(char letra) {
        switch (letra) {
            case ' ':
                return "0";
            case 'a':
            case 'b':
            case 'c':
                return "2";
            case 'd':
            case 'e':
            case 'f':
                return "3";

            case 'g':
            case 'h':
            case 'i':
                return "4";
            case 'j':
            case 'k':
            case 'l':
                return "5";
            case 'm':
            case 'n':
            case 'o':
                return "6";
            case 'p':
            case 'q':
            case 'r':
            case 's':
                return "7";
            case 't':
            case 'u':
            case 'v':
                return "8";
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return "9";
            default:
                return "";
        }
    }
}
