package aula3;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int num1 = leia.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = leia.nextInt();

        if (num1 >= num2) {
            System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
            System.exit(0);
        }

        System.out.println("Intervalo válido! Os números múltiplos de 3 e 5 no intervalo são:");

        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
