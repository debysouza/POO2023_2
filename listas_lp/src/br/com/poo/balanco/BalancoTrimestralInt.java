package br.com.poo.balanco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralInt {

	private Integer gastosJaneiro = 15000;
	private Integer gastosFevereiro = 23000;
	private Integer gastosMarco = 17000;
	
	private Integer somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	private static Logger logger = Logger.getLogger(BalancoTrimestralInt.class.getName());
	
	public int soma() {
//		System.out.printf("O balanço trimestral é de R$ %d\n", somaTotal);
		logger.log(Level.INFO, "O balanço trimestral é de R$ ");
		return somaTotal;
	}
	
	public int soma(int janeiro) {
		System.out.printf("O gasto de Janeiro é de R$ %d\n", janeiro);
		return janeiro;
	}
	
	public int soma(int janeiro, int fevereiro) {
		int somaBi = janeiro + fevereiro;
		System.out.printf("O gasto do primeiro bimestre é de R$ %d\n", somaBi);
		return somaBi;
	}
	
	public int soma(int janeiro, int fevereiro, int marco) {
		int somaTri = janeiro + fevereiro + marco;
		System.out.printf("O gasto do primeiro bimestre é de R$ %d\n", somaTri);
		return somaTri;
	}
	
}
