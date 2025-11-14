public class Main {
    public static void main(String[] args) {
        System.out.println("=== Proyecto Funciones en Java ===");

        // Llamada a la función sin parámetros y sin retorno
        funcionSinParametrosSinRetorno();

        // Llamada a la función con parámetros y sin retorno
        funcionConParametrosSinRetorno("Santiago", 31);
    }

    // 1. Función sin parámetros y sin retorno
    public static void funcionSinParametrosSinRetorno() {
        System.out.println("Esta es una función sin parámetros y sin retorno.");
    }

    // 2. Función con parámetros y sin retorno
    public static void funcionConParametrosSinRetorno(String nombre, int edad) {
        System.out.println("Hola " + nombre + ". Tienes " + edad + " años.");
    }
}