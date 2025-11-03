package Atividade1;

import java.util.Scanner;

public class NumPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== VERIFICAR NÚMERO PERFEITO ===");

        // Pedir para o usuário digitar o número
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int soma = 0;

        // Laço para verificar todos os divisores de 1 até n-1
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }

        // Verifica se a soma dos divisores é igual ao número
        if (soma == n) {
            System.out.println(n + " é um número perfeito!");
        } else {
            System.out.println(n + " não é um número perfeito.");
        }
    }
}
