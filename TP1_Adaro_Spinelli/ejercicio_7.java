import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c, resultado1 = 0, resultado2 = 0;

        System.out.print("Ingrese el valor de a: ");
        a = scanner.nextFloat();
        System.out.print("Ingrese el valor de b: ");
        b = scanner.nextFloat();
        System.out.print("Ingrese el valor de c: ");
        c = scanner.nextFloat();

        resultado1 = (-b + (float)Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        resultado2 = (-b - (float)Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println("\nEl resultado 1 es: " + resultado1);
        System.out.println("\nEl resultado 2 es: " + resultado2);

    }
}
