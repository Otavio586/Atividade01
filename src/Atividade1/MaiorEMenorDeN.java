package Atividade1;

import java.util.Scanner;

public class MaiorEMenorDeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MAIOR E MENOR DE N NÚMEROS ===");

        // Solicita ao usuário quantos números serão digitados
        System.out.print("Quantos números você quer digitar? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Quantidade inválida!");
            return;
        }

        // Inicializa as variáveis maior e menor
        System.out.print("Digite o número 1: ");
        int numero = sc.nextInt();
        int maior = numero;
        int menor = numero;

        // Laço para os próximos números
        for (int i = 2; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
