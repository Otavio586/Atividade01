package Atividade1;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        System.out.println("\n=== VERIFICAR SE O ANO É BISSEXTO ===");

        Scanner sc = new Scanner(System.in);

        // Entrada do ano
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        // Verificando se o ano é bissexto
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        sc.close();
    }
}
