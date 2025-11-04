package Atividade02;

import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {

        System.out.println("=== BUSCA DE NOME DE ALUNO ===");

        Scanner sc = new Scanner(System.in);

        // Vetor para armazenar os nomes
        String[] nomes = new String[10];

        // Leitura dos 10 nomes
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
            nomes[i] = sc.nextLine();
        }

        // Controle do loop
        boolean encontrado = false;

        // Loop que só termina quando o nome for encontrado
        do {
            System.out.print("\nDigite o nome que deseja buscar: ");
            String busca = sc.nextLine();

            // Verifica se o nome está na lista
            for (int i = 0; i < 10; i++) {
                if (nomes[i].equalsIgnoreCase(busca)) {
                    encontrado = true;
                    break;
                }
            }

            // Verifica se o nome foi encontrado no vetor
            if (encontrado) {
                System.out.println("\nO nome está na lista.");
            } else {
                System.out.println("\nNome não encontrado.");
            }

        // While para repetir até achar um nome da lista
        } while (!encontrado);

        sc.close();
    }
}
