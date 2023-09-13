package br.com.poo.sb.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.poo.sb.contas.Conta;
import br.com.poo.sb.contas.ContaPoupanca;
import br.com.poo.sb.enums.ContaEnum;
import br.com.poo.sb.pessoas.Cliente;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));

		String linha = "";

		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");

				if(dados[0].equalsIgnoreCase(ContaEnum.POUPANCA.name())) {
					//String tipoConta, String numConta, String cpf, Double saldo
					ContaPoupanca cp = new ContaPoupanca(dados[0],
							dados[1], dados[2], Double.parseDouble(dados[3]));
					Conta.mapaContas.put(dados[2], cp);
					System.out.println(cp);
				} else if(dados[0].equalsIgnoreCase("CORRENTE")) {
					//String tipoConta, String numConta, String cpf, double saldo, double chequeEspecial
					
				} else if(dados[0].equalsIgnoreCase("CLIENTE")) {
					//String TIPO_PESSOA, String nome, String cpf, Integer senha
					Cliente c = new Cliente(dados[0], dados[1], dados[2], 
							Integer.parseInt(dados[3]));
					Cliente.mapaClientes.put(dados[2], c);
				} else if(dados[0].equalsIgnoreCase("GERENTE")) {
					
				} else if(dados[0].equalsIgnoreCase("DIRETOR")) {
					
				} else if(dados[0].equalsIgnoreCase("PRESIDENTE")) {
					
				}
			} else {
				break;
			}
		}
		System.out.println(Conta.mapaContas);
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		String teste;
		Scanner sc = new Scanner(System.in);

		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

		System.out.println("Escreva algo: ");
		teste = sc.nextLine();
		buffWriter.append(teste + "\n");
		sc.close();
		buffWriter.close();
	}

	//comprovante de saque
	public static void comprovanteSaque(Conta conta, Double valor) throws IOException {
		String path = conta.getTipoConta() + "_" + conta.getCpf();
		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter(PATH_BASICO + path + EXTENSAO, true));
		
		
		
		String linha = "************* SAQUE *************";
		buffWrite.append(linha + "\n");
		
		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");
		
		linha = "Conta: " + conta.getNumConta();
		buffWrite.append(linha + "\n");
		
		linha = "Valor do Saque: " + valor;
		buffWrite.append(linha + "\n");
		
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		linha = "Operação realizada em: " + dtf.format(dataHora);
		buffWrite.append(linha + "\n");
		
		linha = "******** FIM SAQUE ********";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
		
//		buffWrite.append("********* SAQUE *********\n");
//		buffWrite.append("CPF: " + conta.getCpf() + "\n");
//		buffWrite.append("Conta: " + conta.getNumConta() + "\n");
//		buffWrite.append("Valor do Saque: " + valor + "\n");
//		buffWrite.append("******** FIM SAQUE ********\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void leitor(String path) {
//		try {
//			BufferedReader buffRead = new BufferedReader(
//					new FileReader(PATH_BASICO+path+EXTENSAO));
//			String linha = "";
//			while(true) {
//				linha = buffRead.readLine();
//				if(linha != null) {
//					System.out.println(linha);
//				} else {
//					break;
//				}
//			}
//			buffRead.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
