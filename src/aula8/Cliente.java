package aula8;

public class Cliente {

	
	private int numero;
	private int agencia;
	private String tipo;
	private String titular;
	private float saldo;
	
	
	public Cliente(int numero, int agencia,String tipo, String titular, float saldo) {
		this.agencia = agencia ;
		this.numero = numero ;
		this.tipo = tipo ;
		this.titular = titular ;
		this.saldo = saldo ;
	}
	
	public void visualizar() {
		System.out.println(this.numero+"\n" + this.agencia+"\n" + this.tipo + "\n" + this.titular + "\n" + this.saldo + "\n");
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	
	

}
