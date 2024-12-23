package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = s.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double add = s.nextDouble();
		
		
		CurrencyConverter cc = new CurrencyConverter(dollar, add);
		
		System.out.printf("Amount to be paid in reais = %.2f\n",cc.calculationReal());
		s.close();
	}

}
