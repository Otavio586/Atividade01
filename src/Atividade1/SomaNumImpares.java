package Atividade1;

import java.util.Scanner;

public class SomaNumImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SOMA DE NÚMEROS ÍMPARES ===");

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        int soma = 0;

        // Laço para percorrer de 1 até N
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("A soma de todos os números ímpares de 1 até " + n + " é: " + soma);
    }
}
