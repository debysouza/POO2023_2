package br.com.poo.balanco;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		BalancoTrimestralInt bti = new BalancoTrimestralInt();
		bti.soma();
		bti.soma(10000);
		bti.soma(10, 50);
		System.out.println(bti.soma(80, 90, 100));
		
	}

}
