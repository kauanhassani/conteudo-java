package aula4;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		int valor,posicao;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar");
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º Número: ");
			numeros[indice] = leia.nextInt();
		}

		System.out.println("Digite o número que você deseja encontrar: ");
		valor = leia.nextInt();
		
		Arrays.sort(numeros);
		posicao = Arrays.binarySearch(numeros, valor);
		
		
		if(posicao == 10 ) {
			System.out.println("O número " + valor +  " está localizado na posição: " + posicao);
		}else {
			System.out.println("O número " + valor + " não foi encontrado!");
		}
	}
		
}
