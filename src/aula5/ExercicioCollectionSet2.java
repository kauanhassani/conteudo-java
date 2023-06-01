package aula5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollectionSet2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		Integer num = 0, numUser = 0;

		for (int contagem = 0; contagem < 10; contagem++) {
			System.out.println("\nDigite uma número:  ");
			num = leia.nextInt();
			numeros.add(num);

		}
		System.out.println("Digite o número que deseja encontrar: ");
		numUser = leia.nextInt();
	

		if (numeros.contains(numUser)) {
			System.out.println(numUser + " foi encontrado!");
		} else {
			System.out.println(numUser + " não foi encontrado");
		}

	}

}
