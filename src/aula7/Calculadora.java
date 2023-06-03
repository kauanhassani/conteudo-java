package aula7;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero1 = 0, numero2 = 0;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
	
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		
		//Mostra o resultado de cada operação
		System.out.println("Soma = " + soma (numero1, numero2));
		System.out.println("Subtração = " + subtracao (numero1, numero2));
		System.out.println("Multiplicação = " + multiplicacao (numero1, numero2));
		System.out.println("Divisão = " + divisao (numero1, numero2));
		
		
		turma();
		
		// Executa o Método float soma() com valores inseridos de forma direta
				System.out.println("\nSoma de valores inseridos de forma direta = " 
						+ soma(10.0f, 5.0f));
				
				
				leia.close();
	}
	
	public static float soma (float numero1,float numero2) {
		return numero1 + numero2;
		
	}
	
	public static float subtracao (float numero1,float numero2) {
		return numero1 - numero2;
		
	}
	
	public static float multiplicacao (float numero1,float numero2) {
		return numero1 * numero2;
		
	}
	
	public static float divisao (float numero1,float numero2) {
		return numero1 / numero2;
		
	}
	
	public static void turma() {
		System.out.println("Calculadora da Turma!!");
	}
	

}
