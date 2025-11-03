package Atividade1;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        System.out.println("\n=== SIMULAÇÃO DE CAIXA ELETRÔNICO ===");

        Scanner sc = new Scanner(System.in);

        // Entrada do valor
        System.out.print("Digite o valor que deseja sacar: ");
        int valor = sc.nextInt();

        // Verifica se o valor é válido
        if (valor < 5) {
            System.out.println("Valor mínimo para saque é R$5.");
        } else {

            int nota100 = valor / 100;
            valor = valor % 100;

            int nota50 = valor / 50;
            valor = valor % 50;

            int nota20 = valor / 20;
            valor = valor % 20;

            int nota10 = valor / 10;
            valor = valor % 10;

            int nota5 = valor / 5;
            valor = valor % 5;

            // Exibe o resultado
            System.out.println("\nQuantidade de notas:");
            System.out.println("Notas de 100: " + nota100);
            System.out.println("Notas de 50:  " + nota50);
            System.out.println("Notas de 20:  " + nota20);
            System.out.println("Notas de 10:  " + nota10);
            System.out.println("Notas de 5:   " + nota5);

            if (valor > 0) {
                System.out.println("\nValor restante que não pode ser sacado: R$" + valor);
            }
        }

        sc.close();
    }
}
