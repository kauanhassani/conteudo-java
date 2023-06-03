package aula8;

public class TestaClientes {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(0,001,"Corrente", "Nauak", 0.02f);
		c1.visualizar();
		
		Cliente c2 = new Cliente(0,002,"Poupança", "Olecram", 1.000f);
		c2.visualizar();

	}

}
