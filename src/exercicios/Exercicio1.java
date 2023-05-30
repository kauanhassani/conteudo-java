package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// tudo que eu uso no código
		float salario, abono, novoSalario;
		
		//"scanner leia" faz o usuário digitar o valor
		Scanner leia = new Scanner(System.in);
			
		//println faz aparecer pro usuario e o retorna ao leia
		System.out.println("Digite o seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		//valor do novo salário
		novoSalario= salario + abono;
		
		System.out.println("Esse é o seu novo salário: " + novoSalario);
		
		
	}

}
