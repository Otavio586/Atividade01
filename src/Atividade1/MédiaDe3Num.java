package Atividade1;

import java.util.Scanner;

public class MédiaDe3Num {
    public static void main(String[] args) {

        System.out.println("\n=== MÉDIA DE TRÊS NOTAS ===");

        Scanner sc = new Scanner(System.in);

        // Entrada das três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("\nA média do aluno é: " + media);

        // Verificando se passou ou não
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        sc.close();
    }
}
