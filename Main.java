public class Main {
    public static void main(String[] args) {
        System.out.println("=== Proyecto Funciones en Java ===");

        // 1. Función sin parámetros y sin retorno
        funcionSinParametrosSinRetorno();

        // 2. Función con parámetros y sin retorno
        funcionConParametrosSinRetorno("Santiago", 31);

        // 3. Función sin parámetros y con retorno
        int resultado = funcionSinParametrosConRetorno();
        System.out.println("Resultado función sin parámetros y con retorno: " + resultado);

        // 4. Función con parámetros y con retorno
        int suma = sumar(10, 20);
        System.out.println("Resultado función con parámetros y con retorno: " + suma);
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

    // 4. Función con parámetros y con retorno
    public static int sumar(int a, int b) {
        return a + b;
    }
}