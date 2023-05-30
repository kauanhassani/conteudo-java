package aula3;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	 int numero;
	 int soma = 0;

		        do {
		            System.out.println("Digite um número (0 para sair): ");
		            numero = scanner.nextInt();

		            if (numero > 0) {
		                soma += numero;
		            }
		        } while (numero != 0);

		        System.out.println("A soma dos números positivos é: " + soma);
		    }
	}