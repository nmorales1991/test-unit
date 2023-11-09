public class Main {

    public static int suma(int a, int b) {
        return a+b;
    }

    public static int resta(int a, int b) {
        return a-b;
    }

    public static String mensaje(int total) {
        return "El total es: "+total;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int totalSuma = suma(a, b);
        int totalResta = resta(a, b);
        System.out.println(mensaje(totalSuma));
        System.out.println(mensaje(totalResta));
    }
}