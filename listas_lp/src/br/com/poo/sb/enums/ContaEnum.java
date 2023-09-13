package br.com.poo.sb.enums;

public enum ContaEnum {
	CORRENTE("Corrente", 1),
	POUPANCA("Poupança", 2);
	
	private String tipoConta;
	private int id;
	
	ContaEnum(String tipoConta, int id) {
		this.tipoConta = tipoConta;
		this.id = id;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public int getId() {
		return id;
	}
	
}
