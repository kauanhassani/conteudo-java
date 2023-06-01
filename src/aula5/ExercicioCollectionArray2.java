package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioCollectionArray2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Integer num = 0, numUser = 0;
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.println("Digite os números da lista: ");
			num = leia.nextInt();
			numeros.add(num);
		}
		System.out.println("Digite o número que você deseja encontrar: ");
		numUser = leia.nextInt();
		if(numeros.contains(numUser)) {
			System.out.println("O número "+ numUser + " está localizado na posição: "
					+ numeros.indexOf(numUser));
		}
		else{
			System.out.println("O número " + numUser +" não foi encontrado!");
		}
		
	}

}
