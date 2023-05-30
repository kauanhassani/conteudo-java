package aula3;

import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int contadorMenor21 = 0, contadorMaior50 = 0;

        while (true) {
            System.out.println("Digite a idade (ou um número negativo para sair):");
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            if (idade < 21) {
                contadorMenor21++;
            } else if (idade > 50) {
                contadorMaior50++;
            }
        }

        System.out.println("Total de pessoas com menos de 21 anos: " + contadorMenor21);
        System.out.println("Total de pessoas com mais de 50 anos: " + contadorMaior50);
    }
}
