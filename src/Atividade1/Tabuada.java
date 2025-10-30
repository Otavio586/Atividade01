package Atividade1;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("\n=== TABELA DE MULTIPLICAÇÃO ===");

        Scanner sc = new Scanner(System.in);

        // Lê o número digitado pelo usuário
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();
        System.out.println("\nTabuada do " + numero + ":");

        // Laço for para mostrar a tabuada de 1 até 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}
