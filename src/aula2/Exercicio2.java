package aula2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if (numero % 2==0 && numero > 0 ) { 
			System.out.println(numero + " é par e positivo");
		} else if(numero % 2!= 0 && numero>0) {
			System.out.println(numero + " é ímpar e positivo");
		} else if(numero % 2==0 && numero < 0) {
			System.out.println(numero + " é par e negativo");
		} else {
			System.out.println(numero + " é ímpar e negativo");
		}
	}

}
