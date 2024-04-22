import java.util.Scanner;

public class ejercicio_5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, resultado = 0;

        System.out.print("Ingrese la nota del primer estudiante: ");
        a = scanner.nextInt();
        System.out.print("Ingrese la nota del segundo estudiante: ");
        b = scanner.nextInt();
        System.out.print("Ingrese la nota del tercer estudiante: ");
        c = scanner.nextInt();
        System.out.print("Ingrese la nota final del cuarto estudiante: ");
        d = scanner.nextInt();

        
        a *= 0.25;
        b *= 0.25;
        c *= 0.25;
        d *= 0.25;

    
        resultado = a + b + c + d;
        System.out.println("\nEl resultado final es: " + resultado);  

    }
}
