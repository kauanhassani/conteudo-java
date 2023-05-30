package aula2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = ler.nextInt();
		
		if (num1 + num2 > num3 ) { 
		System.out.println("A soma dos números 1 e 2 é o maior que " + num3 );
		}else if (num1 + num2 == num3) {
			System.out.println("A soma dos números 1 e 2 é igual a " + num3);
		}else if (num1 + num2 < num3) {
			System.out.println("A soma dos números 1 e 2 é o menor que " + num3);
		}

	}

}
