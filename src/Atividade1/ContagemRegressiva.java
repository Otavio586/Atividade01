package Atividade1;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CONTAGEM REGRESSIVA ===");

        // Pedir para o usuário digitar o número inicial
        System.out.print("Digite o número inicial da contagem: ");
        int n = sc.nextInt();

        System.out.println("\nContagem regressiva:");

        // Laço para contagem regressiva
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Fim da contagem!");
    }
}
