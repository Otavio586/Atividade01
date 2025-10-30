package Atividade1;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usuário irá inserir um número
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        // É executado a operação % para descobrir o resto, consenquentemente ver se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        sc.close();
    }
}
