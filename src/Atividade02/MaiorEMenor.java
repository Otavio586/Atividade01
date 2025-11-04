package Atividade02;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {

        System.out.println("=== MAIOR E MENOR VALOR ===");

        Scanner sc = new Scanner(System.in);

        // Vetor para armazenar os 10 números
        int[] numeros = new int[10];

        // Leitura dos 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        // Percorrendo o vetor para encontrar o maior e o menor
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\nO maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}
