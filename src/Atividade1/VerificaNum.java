package Atividade1;

import java.util.Scanner;

public class VerificaNum {
    public static void main(String[] args) {

        System.out.println("\n=== VERIFICAR SE O NÚMERO É POSITIVO, NEGATIVO OU ZERO ===");

        Scanner sc = new Scanner(System.in);

        // Entrada do número (aceita decimais)
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        // Verificação do número
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        sc.close();
    }
}
