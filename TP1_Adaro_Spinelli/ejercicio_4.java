import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c, d, resultado = 0;

        System.out.print("Ingrese el valor de a: ");
        a = scanner.nextFloat();
        System.out.print("Ingrese el valor de b: ");
        b = scanner.nextFloat();
        System.out.print("Ingrese el valor de c: ");
        c = scanner.nextFloat();
        System.out.print("Ingrese el valor de d: ");
        d = scanner.nextFloat();

        resultado = a + (b / (c - d));

        System.out.println("\nEl resultado es: " + resultado);

    }
}
