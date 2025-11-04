package Atividade02;

import java.util.Scanner;

public class DobroVetor {
    public static void main(String[] args) {

        System.out.println("=== VETOR COM O DOBRO DOS VALORES ===");

        Scanner sc = new Scanner(System.in);

        // Vetores para armazenar os números
        int[] numeros = new int[5];
        int[] dobro = new int[5];

        // Leitura dos 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
            dobro[i] = numeros[i] * 2;
        }

        System.out.println("\nNúmero  |  Dobro");
        System.out.println("-----------------");

        // Exibindo os dois vetores lado a lado
        for (int i = 0; i < 5; i++) {
            System.out.println("   " + numeros[i] + "     |    " + dobro[i]);
        }

        sc.close();
    }
}
