package Atividade1;

import java.util.Scanner;

public class ClassificacaoDeIdade {
    public static void main(String[] args) {
        System.out.println("\n=== CLASSIFICAÇÃO DE IDADE ===");

        Scanner sc = new Scanner(System.in);

        // Usuário irá inserir idade
        System.out.print("Insira a idade: ");
        int idade = sc.nextInt();

        // Estrutura condicional para classificar a idade
        if (idade < 12) {
            System.out.println("\nClassificação: Criança");
        }
        else if (idade >= 12 && idade < 18) {
            System.out.println("\nClassificação: Adolescente");
        }
        else if (idade >= 18 && idade < 60) {
            System.out.println("\nClassificação: Adulto");
        }
        else {
            System.out.println("\nClassificação: Idoso");
        }

        sc.close();
    }
}
