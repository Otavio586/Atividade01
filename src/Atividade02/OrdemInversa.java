package Atividade02;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {

        System.out.println("=== VETOR EM ORDEM INVERSA ===");

        Scanner sc = new Scanner(System.in);

        // Vetor com 8 posições
        int[] numeros = new int[8];

        // Leitura dos 8 números
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");

        // Exibindo o vetor
        for (int i = 7; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}
