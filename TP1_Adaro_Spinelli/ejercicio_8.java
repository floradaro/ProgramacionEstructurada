import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.print("Digite 3 números: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        
        if (n1 > n2 && n1 > n3) {
            System.out.println("El mayor es: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("El mayor es: " + n3);
        }
        
    }
}
