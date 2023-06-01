package aula6;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class ExercicioFila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		String nomes;
		Boolean exe = true;
		
		while(exe) {
			
		
		System.out.println("*************************************************");
		System.out.println("\t1 - Adicionar Clientes na Fila\t");
		System.out.println("\t2 - Listar todos os Clientes\t");
		System.out.println("\t3 - Retirar Cliente da fila\t");
		System.out.println("\t0 - Sair\t");
		System.out.println("*************************************************");
		
		System.out.println("\tEntre com a opção desejada\t");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1 : 
			System.out.println("\tAdicione o nome do cliente\t");
			nomes = leia.next();
			fila.add(nomes);
			System.out.println("\tCliente adicionado!!\t");
			
			break;
			
		case 2:
			System.out.println("\tLista de cliente na fila\t" + fila);
			
			break;
			
		case 3:
			if(fila.size()== 0) {
				System.out.println("\tA fila está vazia!\t");
			} else {
				System.out.println(fila.poll());
				System.out.println("O cliente foi chamado!");
				System.out.println("Fila: " + fila);
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
