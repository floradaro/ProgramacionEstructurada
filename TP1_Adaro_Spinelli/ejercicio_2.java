import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        String sexo;
        float altura;

        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
        System.out.print("Ingrese su sexo: ");
        sexo = scanner.next();
        System.out.print("Ingrese su altura: ");
        altura = scanner.nextFloat();

        System.out.println("\nEdad: " + edad);
        System.out.println("\nSexo: " + sexo);
        System.out.println("\nAltura: " + altura);

    }
}
