public class Main {
    public static void main(String[] args) {
        System.out.println("=== Proyecto Funciones en Java ===");
        // Llamadas a funciones
        funcionSinParametrosSinRetorno();
        funcionConParametrosSinRetorno("Santiago", 31);
        System.out.println("Resultado función sin parámetros con retorno: " + funcionSinParametrosConRetorno());
    }

    // 1. Función sin parámetros y sin retorno
    public static void funcionSinParametrosSinRetorno() {
        System.out.println("Esta es una función sin parámetros y sin retorno.");
    }

    // 2. Función con parámetros y sin retorno
    public static void funcionConParametrosSinRetorno(String nombre, int edad) {
        System.out.println("Hola " + nombre + ". Tienes " + edad + " años.");
    }

    // 3. Función sin parámetros y con retorno
    public static int funcionSinParametrosConRetorno() {
        return 7;
    }
}