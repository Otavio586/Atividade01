package Atividade1;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        System.out.println("\n=== VERIFICAR SE UM NÚMERO É PRIMO ===");

        Scanner sc = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        boolean primo = true;

        // Números menores ou iguais a 1 não são primos
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        // Exibe o resultado
        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        sc.close();
    }
}
