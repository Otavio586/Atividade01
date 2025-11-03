package Atividade1;

import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== VALIDAÇÃO DE SENHA ===");

        // Solicita ao usuário digitar a senha
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        // Verifica se a senha possui pelo menos 6 caracteres
        if (senha.length() >= 6) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida! Deve ter pelo menos 6 caracteres.");
        }
    }
}
