public class Main {

    public static void main(String[] args) {

        System.out.println("=== Proyecto Funciones en Java ===");

        funcionSinParametrosSinRetorno();
        funcionConParametrosSinRetorno("Santiago", 31);
        System.out.println("Resultado función sin parámetros con retorno: " + funcionSinParametrosConRetorno());
        System.out.println("Resultado función con parámetros y con retorno: " + sumar(10, 20));
    }


    public static void funcionSinParametrosSinRetorno() {
        System.out.println("Hola, soy una función sin parámetros y sin retorno.");
    }

   
    public static void funcionConParametrosSinRetorno(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }

   
    public static int funcionSinParametrosConRetorno() {
        return 42;
    }

    
    public static int sumar(int a, int b) {
        return a + b;
    }
}