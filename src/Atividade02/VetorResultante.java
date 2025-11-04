package Atividade02;

import java.util.Scanner;

public class VetorResultante {
    public static void main(String[] args) {

        System.out.println("=== UNIÃO DE DOIS VETORES ===");

        Scanner sc = new Scanner(System.in);

        // Primeiro vetor
        int[] vetor1 = new int[5];

        // Segundo vetor
        int[] vetor2 = new int[5];

        // Vetor resultante
        int[] vetor3 = new int[10];

        // Leitura do primeiro vetor
        System.out.println("\n--- Digite os valores do primeiro vetor ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor1[i] = sc.nextInt();
        }

        // Leitura do segundo vetor
        System.out.println("\n--- Digite os valores do segundo vetor ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor2[i] = sc.nextInt();
        }

        // Juntando os dois vetores no terceiro
        for (int i = 0; i < 5; i++) {
            vetor3[i] = vetor1[i]; // copia o vetor1
            vetor3[i + 5] = vetor2[i]; // copia o vetor2 nas posições seguintes
        }

        // Vetor resultante
        System.out.println("\n--- Vetor resultante (com todos os valores) ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + vetor3[i]);
        }

        sc.close();
    }
}
