package Atividade1;

public class TabuadaCompleta {
    public static void main(String[] args) {

        System.out.println("=== TABUADA COMPLETA DE 1 A 10 ===");

        // Laço externo para os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabuada do " + i + ":");  //(Mostra qual tabuada está sendo exibida)

            // Laço interno para multiplicar de 1 a 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));  //(Mostra o resultado da multiplicação)
            }
        }
    }
}
