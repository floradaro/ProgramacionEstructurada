import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float cateto1, cateto2, hipotenusa = 0;

        System.out.print("Ingrese el valor del cateto1: ");
        cateto1 = scanner.nextFloat();
        System.out.print("Ingrese el valor del cateto2: ");
        cateto2 = scanner.nextFloat();

        hipotenusa = (float)Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println("\nLa longitud de la hipotenusa es de: " + hipotenusa);

    }
}
