package Atividade1;

import java.util.Scanner;

public class MaiorEntreDoisNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usuário irá inserir 2 números
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        // O código irá executar e irá informar qual número é maior ou se eles são iguais
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        sc.close();
    }
}


