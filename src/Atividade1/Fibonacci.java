package Atividade1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("=== SEQUÊNCIA DE FIBONACCI ===");

        Scanner sc = new Scanner(System.in);

        // Solicitar quantos números mostrar
        System.out.print("Digite quantos números da sequência mostrar: ");
        int n = sc.nextInt();

        int primeiro = 0; // Primeiro número da sequência
        int segundo = 1;  // Segundo número da sequência

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");

        // Mostrar os números
        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " "); // Mostrar o número atual
            int proximo = primeiro + segundo; // Calcular próximo número
            primeiro = segundo; // Atualizar primeiro
            segundo = proximo;  // Atualizar segundo
        }

        sc.close();
    }
}
