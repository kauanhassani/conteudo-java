package aula8;

public class Funcionario {

	private String nome; 
	private Long cpf;
	private String rg;
	private String cidade;
	private int salario;

	public Funcionario(String nome, Long cpf, String rg, String cidade, int salario) {

		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.cidade = cidade;
		this.salario = salario;
	}

	public void visualizar() {
		System.out.print(this.nome + "\n" + this.cpf + "\n" + this.rg + "\n" + this.cidade + "\n" + this.salario + "\n");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

}
