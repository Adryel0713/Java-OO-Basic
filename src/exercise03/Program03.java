package exercise03;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		String name = s.nextLine();
		double t1 = s.nextDouble();
		double t2 = s.nextDouble();
		double t3 = s.nextDouble();
		
		Student st = new Student(name, t1, t2, t3);
		
		st.getFinalGrade();
		
		
		s.close();

	}

}
