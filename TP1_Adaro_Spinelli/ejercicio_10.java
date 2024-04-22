import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        System.out.print("Ingrese un caracter: ");
        letra = scanner.next().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal minúscula");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Es una vocal mayúscula");
                break;
            default:
                System.out.println("No es una vocal");
                break;
        }

    }
}
