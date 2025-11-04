package Atividade02;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        System.out.println("=== CÁLCULO DA MÉDIA DAS NOTAS ===");

        Scanner sc = new Scanner(System.in);

        // Vetor para armazenar as 5 notas
        double[] notas = new double[5];
        double soma = 0;

        // Loop para ler as 5 notas
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / 5;

        System.out.println("\nA média das notas é: " + media);

        sc.close();
    }
}
