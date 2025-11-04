package Atividade02;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {

        System.out.println("=== CONTADOR DE PARES E ÍMPARES ===");

        Scanner sc = new Scanner(System.in);

        // Vetor para armazenar os 10 números
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        // Leitura dos 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

            // Verificando se é par ou ímpar
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        sc.close();
    }
}
