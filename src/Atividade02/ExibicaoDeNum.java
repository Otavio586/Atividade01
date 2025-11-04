package Atividade02;

import java.util.Scanner;

public class ExibicaoDeNum {
    public static void main(String[] args) {

        System.out.println("=== LEITURA DE 5 NÚMEROS ===");

        Scanner sc = new Scanner(System.in);

        // Cria um vetor com 5 posições
        int[] numeros = new int[5];

        // Laço para ler os 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\n=== NÚMEROS DIGITADOS ===");

        // Laço para exibir os números armazenados
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        sc.close();
    }
}
