package Atividade1;

import java.util.Scanner;

public class SomaAteN {
    public static void main(String[] args) {
        System.out.println("\n=== SOMA DE 1 ATÉ N ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt(); // Lê o número digitado pelo usuário

        int soma = 0;

        // Laço for para somar todos os números de 1 até N
        for (int i = 1; i <= n; i++) {
            soma += i; 
        }

        System.out.println("\nA soma de 1 até " + n + " é: " + soma);

        sc.close();
    }
}
