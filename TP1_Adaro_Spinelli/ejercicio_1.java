import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, IVA = 1.21f;

        System.out.print("Ingrese el precio del producto a: ");
        a = scanner.nextFloat();
        IVA = a * IVA;

        System.out.println("El valor del producto sin aplicarle el IVA es de: " + a);
        System.out.println("El resultado final al aplicarle el IVA es de: " + IVA);
    }
}