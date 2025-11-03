package Atividade1;

import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {
    public static void main(String[] args) {

        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");

        Scanner sc = new Scanner(System.in);

        // Gerar número aleatório entre 1 e 100
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        int palpite = 0;
        int tentativas = 0;

        // Enquanto o palpite estiver errado, continuar pedindo
        while (palpite != numeroSecreto) {
            System.out.print("Digite um número entre 1 e 100: ");
            palpite = sc.nextInt();
            tentativas = tentativas + 1;

            if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Tente um número menor!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        }
        sc.close();
    }
}
