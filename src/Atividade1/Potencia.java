package Atividade1;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {

        System.out.println("=== CÁLCULO DE POTÊNCIA ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base (a): ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente (b): ");
        int expoente = sc.nextInt();

        // Inicializar resultado
        int resultado = 1;

        // Multiplicar a base por ela mesma expoente vezes
        for (int i = 1; i <= expoente; i++) {
            resultado = resultado * base;
        }

        // Mostrar resultado
        System.out.println(base + " elevado a " + expoente + " é: " + resultado);


        sc.close();
    }
}
