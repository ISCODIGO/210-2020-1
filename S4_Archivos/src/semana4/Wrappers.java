package semana4;

/**
 *
 * @author jeavila
 */
public class Wrappers {
    public static void main(String[] args) {
        // Con los wrappers es posible determinar ciertas caracterestas utiles
        // para los tipos de datos primitivos
        System.out.printf("Bytes: %d Size (bits): %d Min: %d Max: %d%n", 
                Integer.BYTES, Integer.SIZE, Integer.MIN_VALUE, 
                Integer.MAX_VALUE);
        
        // Es posible utilizar los wrappers con sus tipos primitivos
        int var1 = 10;
        Integer var2 = 100;        
        var2 += var1;        
        System.out.println(var2);       // Imprime 110
        
        // Es posible parsear una cadena para obtener un valor primitivo
        String cadena = "3";
        int entero = Integer.parseInt(cadena);
        System.out.println(entero);     // Imprime 3 (como un tipo int)

        // Existen otras operaciones como obtener valors maximos o minimos
        System.out.println(Integer.max(var1, var2)); // Imprime 110
    }
}
