package fixacao2;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = s.nextInt();
		s.nextLine();
		System.out.print("Enter account holder: ");
		String holder = s.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		String yn = s.nextLine();
		
		Account acc = new Account(number, holder);
		
		if(yn.charAt(0) == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = s.nextDouble();
			
			acc.deposit(deposit);
		}
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.println(acc);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = s.nextDouble();
		acc.deposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = s.nextDouble();
		acc.withDraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		s.close();
	}

}
