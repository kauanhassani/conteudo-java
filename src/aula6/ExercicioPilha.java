package aula6;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner (System.in);
		int opcao = 0;
		String nomes;
		Boolean exe = true;
		
		while(exe) {
			
		
		System.out.println("*************************************************");
		System.out.println("\t1 - Adicionar Livros na pilha\t");
		System.out.println("\t2 - Listar todos os livros\t");
		System.out.println("\t3 - Retirar livro da pilha\t");
		System.out.println("\t0 - Sair\t");
		System.out.println("*************************************************");
		
		System.out.println("\tEntre com a opção desejada\t");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1 : 
			System.out.println("\tAdicione o nome do livro\t");
			leia.nextLine();
			nomes = leia.nextLine();
			pilha.add(nomes);
			System.out.println("\tLivro adicionado!!\t");
			
			break;
			
		case 2:
			System.out.println("\tLista de livros na pilha\t" + pilha);
			
			break;
			
		case 3:
			if(pilha.size()== 0) {
				System.out.println("\tA pilha está vazia!\t");
			} else {
				System.out.println(pilha.pop());
				System.out.println("Um livro foi retirado da pilha!");
				System.out.println("pilha: " + pilha);
			}
			
			break;
			
			default:
				if(opcao == 0) {
				exe = false;
				System.out.println("Programa finalizado!!!!!!!!!!!!!!");	
				
			}
				else { 
					System.out.println("Digite um número valido");
				
			}
		}
	}
  }
}
