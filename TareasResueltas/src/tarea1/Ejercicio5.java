package tarea1;

public class Ejercicio5 {

    public static void main(String[] args) {
        final int LINEAS = 8;
        
        for (int i = 0; i < LINEAS; i++) {
            if (i % 2 == 0) {
                System.out.print(" ");
            }
            for (int j = 0; j < LINEAS; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

}
