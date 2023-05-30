package aula4;

import java.util.Scanner;

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		int elementos = 3;
		int matrizNumeros[][] = new int[elementos][elementos];
		int contador = 1;
		int soma = 0;

		Scanner leia = new Scanner(System.in);
		
		for (int linha = 0; linha < matrizNumeros.length; linha++) {
			for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {
				matrizNumeros[linha][coluna] = contador;
				soma += matrizNumeros[linha][coluna];
				contador++;
			}
		}

		for (int linha = 0; linha < matrizNumeros.length; linha++) {
			for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {
				System.out.print(matrizNumeros[linha][coluna] + " , ");
			}
			System.out.println();
		}
		
		System.out.println("Elementos da Diagonal principal");
		for(int linha = 0; linha < matrizNumeros.length; linha++) {
			System.out.print(matrizNumeros[linha][linha] + " , ");
		}
		
		System.out.println("\nElementos da Diagonal secundária");
		for(int linha = 0; linha < matrizNumeros.length; linha++) {
			for(int coluna = matrizNumeros.length-1; coluna>=0;coluna-- ) {
				System.out.print(matrizNumeros[linha][coluna] + " , ");
				linha++;
			}
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: ");
		
	}
}
