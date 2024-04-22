import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3, n4;

        System.out.print("Ingrese tres números: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        System.out.print("Ingrese un cuarto número: ");
        n4 = scanner.nextInt();

        if (n1 == n4 || n2 == n4 || n3 == n4) {
            System.out.println("Es igual a un número ya introducido anteriormente");
        } else {
            System.out.println("Es diferente a los números ingresados anteriormente");
        }

    }
}
