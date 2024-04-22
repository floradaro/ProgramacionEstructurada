import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("El número ingresado es cero");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo");
        } else {
            System.out.println("El número ingresado es positivo");
        }

    }
}
