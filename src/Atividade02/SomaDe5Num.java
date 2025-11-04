package Atividade02;

import java.util.Scanner;

public class SomaDe5Num {
    public static void main(String[] args) {

        System.out.println("=== SOMA DE 5 NÚMEROS ===");

        Scanner sc = new Scanner(System.in);

        // Cria um vetor com 5 posições
        int[] numeros = new int[5];
        int soma = 0;

        // Ler os 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        // Exibindo a soma
        System.out.println("\nSoma total dos números: " + soma);

        sc.close();
    }
}
