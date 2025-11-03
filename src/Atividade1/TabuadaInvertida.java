package Atividade1;

import java.util.Scanner;

public class TabuadaInvertida {
    public static void main(String[] args) {

        System.out.println("\n=== TABUADA INVERTIDA ===");

        Scanner sc = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número para ver a tabuada invertida: ");
        int numero = sc.nextInt();

        System.out.println("\nTabuada do " + numero + " (de 10 até 1):");

        // Laço de repetição de 10 até 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}
