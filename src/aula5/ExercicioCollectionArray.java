package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioCollectionArray {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();
		String cor = null;

		for (int contagem = 0; contagem < 5; contagem++) {
			System.out.println("\nDigite uma cor:  ");
			cor = leia.next();
			cores.add(cor);

		}
		System.out.println("Lista das cores: ");
		for (String cor1 : cores) {
			System.out.println(cor1);
		}

		System.out.println("Lista das cores ordenadas: ");
		Collections.sort(cores);
		for (String cor1 : cores) {
			System.out.println(cor1);
		}
	}

}
