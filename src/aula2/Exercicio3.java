package aula2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		Scanner ler =new Scanner(System.in);
		
		int numero,quantidade,valor,valorTotal;
		
		System.out.print("Insira o código do produto: ");
		System.out.println("\n[1] Cachorro Quente \n[2] X-Salada \n[3] X-Bacon "
				+ "\n[4] Bauru \n[5] Refrigerante \n[6] Suco de laranja");
		numero = ler.nextInt();
		
		switch (numero) {
		
		case 1:
			System.out.println("Cachorro Quente");
			System.out.println("\nInsira a quantidade? ");
			quantidade = ler.nextInt();
			valor = 10;
			valorTotal = (valor*quantidade);
			System.out.println("Código do produto: " + numero);
			System.out.println("Produto: Cachorro quente");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor Total: R$" + valorTotal);
			
			break;
		case 2:
			System.out.println("X-Salada");
			System.out.println("\nInsira a quantidade? ");
			quantidade = ler.nextInt();
			valor = 15;
			valorTotal = (valor*quantidade);
			System.out.println("Código do produto: " + numero);
			System.out.println("Produto: X-Salada");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor Total: R$" + valorTotal);
			
			break;
		case 3:
			System.out.println("X-Bacon");
			System.out.println("\nInsira a quantidade? ");
			quantidade = ler.nextInt();
			valor = 18;
			valorTotal = (valor*quantidade);
			System.out.println("Código do produto: " + numero);
			System.out.println("Produto: X-Bacon");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor Total: R$" + valorTotal);
			
			break;
		case 4:
			System.out.println("Bauru");
			System.out.println("\nInsira a quantidade? ");
			quantidade = ler.nextInt();
			valor = 12;
			valorTotal = (valor*quantidade);
			System.out.println("Código do produto: " + numero);
			System.out.println("Produto: Bauru");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor Total: R$" + valorTotal);
			
			break;
		case 5:
			System.out.println("Refrigerante");
			System.out.println("\nInsira a quantidade? ");
			quantidade = ler.nextInt();
			valor = 8;
			valorTotal = (valor*quantidade);
			System.out.println("Código do produto: " + numero);
			System.out.println("Produto: Refrigerante");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor Total: R$" + valorTotal);
			
			break;
		case 6:
			System.out.println("Suco de laranja");
			System.out.println("\nInsira a quantidade? ");
			quantidade = ler.nextInt();
			valor = 13;
			valorTotal = (valor*quantidade);
			System.out.println("Código do produto: " + numero);
			System.out.println("Produto: Suco de laranja");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor Total: R$" + valorTotal);
			
		default:
			System.out.println("Insira uma opção inválida!");
			
		}
		

	}

}
