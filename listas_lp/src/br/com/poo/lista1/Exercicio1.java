//pacote da aplicacao
package br.com.poo.lista1;

//lista de bibliotecas
import java.util.Scanner;

//programa do portugol
public class Exercicio1 {

	//funcao inicio do portugol
	//funcao no portugol -> metodo no java
	public static void main(String[] args) {
		//declaracao de variaveis
		String nome;
		String sobrenome;
		//instacia
		Scanner sc = new Scanner(System.in);

		//funcao escreva do Portugol
		System.out.print("Por favor, informe seu nome: ");
		//funcao leia do Portugol
		nome = sc.nextLine();
		//chamar o metodo limpa
		limpa();
		//funcao escreva do Portugol
		System.out.print("Agora, informe seu sobrenome: ");
		//funcao leia do Portugol
		sobrenome = sc.next();
		//fecha Scanner apos ultima utilizacao
		sc.close();
		//chamar o metodo limpa
		limpa();
		//funcao escreva do Portugol
		System.out.println("Seja bem-vindo(a) " + nome + " " + sobrenome);
	}
	
	//utilizacao do laco for para "limpar" a tela
	public static void limpa() {
		for(int i = 0; i < 20; i++) {
			System.out.println();
		}
	}

}
