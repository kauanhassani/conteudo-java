package aula2;

import java.util.Scanner;

public class ExercicioVertebrados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String caracteristica1, caracteristica2, caracteristica3;

		System.out.println("Digite as caracteristicas do animal (vertebrado/invertebrado");
		caracteristica1 = leia.next();
		System.out.println("Digite as caracteristicas ave/mamífero/inseto/anelídeo");
		caracteristica2 = leia.next();
		System.out.println("Digite as caracteristicas canívoro/onívoro/herbívoro/hematófago");
		caracteristica3 = leia.next();

		if (caracteristica1.equalsIgnoreCase("vertebrado")) {
			if (caracteristica2.equalsIgnoreCase("ave")) {
				if (caracteristica3.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				} else {
					System.out.println("Pomba");
				}

			} else {
				if (caracteristica2.equalsIgnoreCase("Onívoro")) {
					System.out.println("pessoa");
				} else {
					System.out.println("vaca");
				}
			}
		} else {

			if (caracteristica2.equalsIgnoreCase("inseto")) {
				if (caracteristica3.equalsIgnoreCase("hematófago")) {
					System.out.println("Pulga");
				}
			} else {
				if (caracteristica2.equalsIgnoreCase("herbívoro")) {
					System.out.println("Lagarta");
				}
			}

		}
	}

}
