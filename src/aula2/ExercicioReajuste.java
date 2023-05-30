package aula2;

import java.util.Scanner;

public class ExercicioReajuste {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String colaborador;
		int cargo;
		float salario,novoSalario;
		 
			
			System.out.println("Digite o nome do colaborador: ");
			colaborador = ler.next();
			
			System.out.println("Digite o seu cargo: ");
			cargo = ler.nextInt();
			
			System.out.println("Digite o seu salário: ");
			salario = ler.nextFloat();
			
			switch(cargo){
			
			case 1:
				novoSalario = salario +(0.10f*salario);
				System.out.println(colaborador + "Gerente" + novoSalario);
				
				break;
				
			case 2:
				novoSalario = salario +(0.7f*salario);
				System.out.println(colaborador + "Vendedor" + novoSalario);
				
				break;
				
			case 3:
				novoSalario = salario +(0.9f*salario);
				System.out.println(colaborador + "Supervisor" + novoSalario);
				
				break;
				
			case 4:
				novoSalario = salario +(0.6f*salario);
				System.out.println(colaborador + "Motorista" + novoSalario);
				
				break;
				
			case 5:
				novoSalario = salario +(0.5f*salario);
				System.out.println(colaborador + "Estoquista" + novoSalario);
				
				break;
				
			case 6:
				novoSalario = salario +(0.8f*salario);
				System.out.println(colaborador + "Tecnico de TI" + novoSalario);
				
				break;
				
			default:
				System.out.println("Insira um código de cargo válido");
				
			}
	  }
}
