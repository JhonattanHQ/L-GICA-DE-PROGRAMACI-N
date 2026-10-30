import java.util.Scanner;

public class AlRevesYMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Numeros al reves: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        int mayor = numeros[0]; // Asumimos inicialmente que el primero es el mayor
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);

    }
}