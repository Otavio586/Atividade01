package Atividade1;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        System.out.println("=== CÁLCULO DE FATORIAL ===");

        Scanner sc = new Scanner(System.in);

        // Solicitar o número
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int fatorial = 1; // Inicializar fatorial

        // Calcular fatorial usando for
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        // Fechar scanner
        sc.close();
    }
}
