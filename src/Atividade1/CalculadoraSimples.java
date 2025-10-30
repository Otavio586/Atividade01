package Atividade1;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        System.out.println("\n=== CALCULADORA ===");

        Scanner sc = new Scanner(System.in);

        // Usuário digita os números e a operação
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite a operação ( +, -, *, / ): ");
        String operacao = sc.next();


        // Execução e exibição das operações
        if (operacao.equals("+")) {
            System.out.println("\nSoma: " + (num1 + num2));
        }
        else if (operacao.equals("-")) {
            System.out.println("\nSubtração: " + (num1 - num2));
        }
        else if (operacao.equals("*")) {
            System.out.println("\nMultiplicação: " + (num1 * num2));
        }
        else if (operacao.equals("/")) {
            if (num2 != 0) { // O segundo número precisa ser divisível por 0 para a divisão acontecer
                System.out.println("\nDivisão: " + ((double) num1 / num2));
            } else {
                System.out.println("\nErro: divisão por zero!");
            }
        }
        else {
            System.out.println("\nOperação inválida!"); // É exibido essa mensagem se o usuário inserir um sinal errado
        }

        sc.close();
    }
}

