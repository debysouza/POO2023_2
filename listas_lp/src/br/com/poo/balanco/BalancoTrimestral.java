package br.com.poo.balanco;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestral {

	//Logger definido fora do metodo
//	private static Logger logger = Logger.getLogger(BalancoTrimestral.class.getName());

	public static void main(String[] args) {	
		//Logger definido dentro do metodo
//		Logger logger = Logger.getLogger(BalancoTrimestral.class.getName());
//		logger.log(Level.INFO, "OOOOO");
		
		//instancia do balanco Integer
//		BalancoTrimestralInt bti = new BalancoTrimestralInt();
//		bti.soma();
//		bti.soma(10000);
//		bti.soma(10, 50);
//		System.out.println(bti.soma(80, 90, 100));
		
		
		//instancia do valor Double
//		BalancoTrimestralDouble btd = new BalancoTrimestralDouble();
//		btd.soma();
//		btd.soma(258);
//		btd.soma(5000, 3000);
//		btd.soma(0, 0, 0);
//		System.out.println(btd.somaTotal);
		
		//instancia do valor BigDecimal
		BalancoTrimestralBigDecimal btg = new BalancoTrimestralBigDecimal();
		btg.soma();
		btg.soma(new BigDecimal(10000));
		btg.soma(new BigDecimal(100), new BigDecimal(50));
		btg.soma(new BigDecimal(100), new BigDecimal(50), new BigDecimal(50000));
	}

}
