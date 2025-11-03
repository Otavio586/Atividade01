package Atividade1;

import java.util.Scanner;

public class ContadorParEImpar {
    public static void main(String[] args) {

        System.out.println("\n=== CONTADOR DE PARES E ÍMPARES ===");

        Scanner sc = new Scanner(System.in);

        // Entrada da quantidade de números
        System.out.print("Quantos números você quer digitar? ");
        int quantidade = sc.nextInt();

        int pares = 0;
        int impares = 0;

        // Loop para ler os números
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibe o resultado
        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        sc.close();
    }
}
