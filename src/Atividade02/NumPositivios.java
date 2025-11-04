package Atividade02;

import java.util.Scanner;

public class NumPositivios {
    public static void main(String[] args) {

        System.out.println("=== EXIBIR APENAS NÚMEROS POSITIVOS ===");

        Scanner sc = new Scanner(System.in);

        // Vetor para armazenar os 10 números
        int[] numeros = new int[10];

        // Leitura dos 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros positivos digitados:");

        // Percorrendo o vetor e mostrando apenas os números positivos
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) { // verifica se o número é positivo
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
