package aula1;

import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		float salarioBruto,adicionalNoturno,horasExtras,descontos,
		salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário bruto: ");
		salarioBruto = leia.nextFloat();
				
		System.out.println("Digite seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite a sua hora extra: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite seus descontos: ");
		descontos = leia.nextFloat();
		
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) -
		descontos;
		
		System.out.println("Esse é o seu salário líquido: " + salarioLiquido);
		
	}
}
