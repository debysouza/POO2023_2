package br.com.poo.sb.pessoas;

public class Funcionario {

	private String cargo;
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
	}

	public Funcionario(String cargo, String nome, String cpf, double salario) {
		this.cargo = cargo;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

	public String getCargo() {
		return cargo;
	}
	
	//metodo de bonificacao - Gerente(menor que o do Diretor) e Diretor
	
}
