package tarea1;

public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%n", "Numero", "Cuadrado", "Cubo");
        for (int i = 0; i <= 10; i++) {
            int cuadrado = (int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);

            System.out.printf("%-10d%-10d%-10d%n", i, cuadrado, cubo);
        }
    }
}
