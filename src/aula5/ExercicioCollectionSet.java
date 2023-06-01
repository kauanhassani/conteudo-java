package aula5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class ExercicioCollectionSet {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();

		Integer num = 0;

		for (int contagem = 0; contagem < 10; contagem++) {
			System.out.println("\nDigite uma número:  ");
			num = leia.nextInt();
			numeros.add(num);

		}
		System.out.println("Lista de números: ");

		Iterator<Integer> num2 = numeros.iterator();

		// Enquanto tiver valor no num 2 vai printar pro user
		while (num2.hasNext()) {
			System.out.println(num2.next());
		}

	}

}
